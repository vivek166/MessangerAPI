package com.synerzip.restapi.Messanger.model;

import java.util.Date;

public class Profile {

	long id;
	String profileName;
	String firsName;
	String lastName;
	Date created;

	public Profile(long id, String profileName, String firsName, String lastName) {
		super();
		this.id = id;
		this.profileName = profileName;
		this.firsName = firsName;
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

}
