package com.message.sender;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class messageSenderClient {
	
		private final String REST_URI = "";
		static Client client = ClientBuilder.newClient();
		
		
		public static void main(String[] args) throws ParseException, FileNotFoundException, IOException
		{
			JSONParser jsonParser = new JSONParser();
			Object messageObject = null;
			System.out.println("Please Enter the message type to send");
			Scanner sc = new Scanner(System.in);
			String messageType = sc.nextLine();
			if(messageType.equalsIgnoreCase("SMS"))
			{
				messageObject = jsonParser.parse(new FileReader("c:\\sms.json"));
			}
			else if(messageType.equalsIgnoreCase("Email"))
			{
				messageObject = jsonParser.parse(new FileReader("c:\\email.json"));
			}
			
			Response response  = client.target("http://localhost:8080/message/sendMessage").request().post(Entity.json(messageObject));
			Response responsebuild = ((Builder) client.target("http://localhost:8080/message/listOfMessages")).accept("application/json").get();
			
			
			
			
			
		}
}
