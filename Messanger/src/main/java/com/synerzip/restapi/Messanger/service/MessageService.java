package com.synerzip.restapi.Messanger.service;

import java.util.ArrayList;

import com.synerzip.restapi.Messanger.model.Message;

public class MessageService {

	public ArrayList<Message> getAllMessage() {
		Message m1 = new Message(1, "vivek", "this is book");
		Message m2 = new Message(1, "vivek", "this is book");

		ArrayList<Message> l = new ArrayList<>();
		l.add(m1);
		l.add(m2);
		return l;
	}

	public void getMessage(long id) {

	}

	public void addMessage() {

	}

	public void updateMessage() {

	}

	public void removeMessage() {

	}
}
