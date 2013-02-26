package com.practicas.git.builders;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "atlasResponseData")
public class AtlasResponse implements Serializable{

	private static final long serialVersionUID = -8965080859783853927L;
	
	private String ticket;
	private String command;
	private Date date;
	private String status;
	private String message;
	private String carrier;
	private String messageSent;
	
	@XmlElement(name = "ticket")
	public String getTicket() {
		return ticket;
	}
	
	
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	
	@XmlElement(name = "command")
	public String getCommand() {
		return command;
	}

	
	public void setCommand(String command) {
		this.command = command;
	}
	
	@XmlElement(name = "date")
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	@XmlElement(name = "status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@XmlElement(name = "message")
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@XmlElement(name = "carrier")
	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
	public String getMessageSent() {
		return messageSent;
	}
	
	
	public void setMessageSent(String messageSent) {
		this.messageSent = messageSent;
	}
	
	@Override
	public String toString(){
		return null;
	}


}
