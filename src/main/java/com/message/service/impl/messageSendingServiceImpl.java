package com.message.service.impl;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

import javax.json.Json;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import com.message.message;
import com.message.messageParser;
import com.sun.research.ws.wadl.Response; 

public class messageSendingServiceImpl implements IMessageSendingService,Serializable  {
	
	public messageSendingServiceImpl()
	{
		
	}
	



// Writing messages to a file using serialization
	@Test
	public ResponseBuilder sendMessage(org.json.JSONObject messageInfo)  {
		   JSONObject jsonObject = (JSONObject)messageInfo;
		   String messageType;
		try {
			messageType = (String)jsonObject.getString("messageType");
			messageParser obj = new messageParser();
			if(messageType.equalsIgnoreCase("sms"))
				messageType = "01";
			else
				messageType = "02";
			
			message message = obj.parse(messageInfo, messageType);
			FileOutputStream fos = new FileOutputStream("c:\\messages.log");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// write object to file
			oos.writeObject(message);
			fos.flush();
			fos.close();
		
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 ResponseBuilder responseBuilder = null;
		  
		return responseBuilder.status(200) ;
	}
	

	@Test
	public String getListOfMessage() {
		
		Object message = null;
		try {
			
			FileInputStream fin = new FileInputStream("c:\\messages.log");
			ObjectInputStream oin= new ObjectInputStream(fin);
			 message = oin.readObject();	
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return message.toString();
	}
	
	

}
