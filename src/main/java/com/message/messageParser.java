package com.message;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;

public class messageParser {

		public message parse(Object messageObject,String MessageType) throws Exception
		{
			message Message = null;
			try
	        {
				//converting Object to JSONObject
	            JSONObject jsonObject = (JSONObject)messageObject;
	            
	            
	            //Reading the String
	            
	            if(MessageType == String.valueOf(MessageTypes.EMAIL))
	            {
	            	String toEmailId = (String)jsonObject.get("toEmail");
	            	String fromEmail = (String)jsonObject.get("fromEmail");
	            	String subject = (String)jsonObject.get("subject");
	            	String senderName = (String)jsonObject.get("senderName");
	            	String message = (String)jsonObject.get("messsage");
	            	Message = new message(fromEmail,toEmailId,subject,senderName,message);
	            }
	            else if(MessageType == String.valueOf(MessageTypes.SMS))
	            {
	            	String senderPhoneNumber = (String)jsonObject.get("fromPhone");
	            	String message = (String)jsonObject.get("message");
	            	String recipientPhone = (String)jsonObject.get("toPhone");
	            	Message = new message(senderPhoneNumber,message,recipientPhone);
	            }
	            
	            
	            //Reading the array
	        //    JSONArray countries = (JSONArray)jsonObject.get("Countries");
	            
	          
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }
			return Message;
		}
}
