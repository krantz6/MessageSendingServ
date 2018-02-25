package com.message.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.json.JSONException;
import org.json.JSONObject;


@Path("message")
public class messageSendingService  {
	
	@GET
	@Path("/listOfMessages")
	@Produces(MediaType.APPLICATION_JSON)
	public String getListOfMessages()
	{
		return applicationContextBeans.getInstance().getListOfMessage();
	}
	
	@POST
	@Path("/sendMessage")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseBuilder sendMessage(JSONObject messageInfo) throws Exception
	{
		return applicationContextBeans.getInstance().sendMessage(messageInfo);
		
	}

}
