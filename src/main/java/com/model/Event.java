package com.model;
/*{
    "name":"Lecture Series",
    "information":"infromation type",
    "location":"Bangalore",
    "date":"24 sep",
    "time":"10 AM",
    "speakers":"Ajinkya Bhosale,Akshay Bhosale"
}*/

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="event")
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String information;
	private String date;
	private String time;
	private String location;
	private String speakers;
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSpeakers() {
		return speakers;
	}
	public void setSpeakers(String speakers) {
		this.speakers = speakers;
	}
	
}
