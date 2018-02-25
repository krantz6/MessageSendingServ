package com.message.service.impl;

import java.io.FileNotFoundException;

import javax.ws.rs.core.Response.ResponseBuilder;

import org.json.JSONException;
import org.json.JSONObject;

public interface IMessageSendingService {

		public String getListOfMessage();
		public ResponseBuilder sendMessage(JSONObject messageInfo) throws JSONException, Exception;
}
