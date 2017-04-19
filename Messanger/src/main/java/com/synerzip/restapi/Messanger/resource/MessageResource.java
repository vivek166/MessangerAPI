package com.synerzip.restapi.Messanger.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.synerzip.restapi.Messanger.model.Message;
import com.synerzip.restapi.Messanger.service.MessageService;


@Path("/message")
public class MessageResource {

	 MessageService message=new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public ArrayList<Message> getMessage(){
		return message.getAllMessage();
	}
}
