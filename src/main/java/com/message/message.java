package com.message;

public class message {

	private String message;
	private String fromPhoneNumber;
	private String recipientPhoneNumber;
	private String fromEmailId;
	private String subject;
	private String toEmailId;
	private String senderName;
	
	
	public message(String fromEmailId,String toEmailId,String senderName,String subject,String message)
	{
		this.fromEmailId = fromEmailId;
		this.toEmailId = toEmailId;
		this.senderName = senderName;
		this.subject = subject;
		this.message = message;
	}
	
	public message(String message,String fromPhoneNumber,String recipientPhoneNumber)
	{
		this.message = message;
		this.fromPhoneNumber = fromPhoneNumber;
		this.recipientPhoneNumber = recipientPhoneNumber;
	}
	
	public String getMessage()
	{
		return this.message;
	}
	public void setMessage(String Message)
	{
		this.message = Message;
	}
	
	public String getFromPhoneNumber()
	{
		return this.fromPhoneNumber;
	}
	
	public void setFromPhoneNumber(String phoneNumber)
	{
		this.fromPhoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber()
	{
		return this.recipientPhoneNumber;
	}
	
	public void setPhoneNumber(String recipientPhoneNumber)
	{
		this.recipientPhoneNumber = recipientPhoneNumber;
	}
	
	public String getFromEmailId()
	{
		return this.fromEmailId;
	}
	
	public void setFromEmailId(String fromEmailId)
	{
		this.fromEmailId = fromEmailId;
	}
	
	public String getToEmailId()
	{
		return this.toEmailId;
	}
	
	public void setToEmailId(String toEmailId)
	{
		this.toEmailId = toEmailId;
	}
	
	public String getSenderName()
	{
		return this.senderName;
	}
	
	public void setSenderName(String senderName)
	{
		this.senderName = senderName;
	}
	
	public String getSubject()
	{
		return this.subject;
	}
	
	public void setSubject(String subject)
	{
		this.subject = subject;
	}
}
