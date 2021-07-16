package com.xworkz.onlineclasses.bean;

import java.io.Serializable;

public class OnlineClassesBean implements Serializable{
private int id;
private String name;
private int noOfPeople;
private String duration ;
private int meetingId;
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
public int getNoOfPeople() {
	return noOfPeople;
}
public void setNoOfPeople(int noOfPeople) {
	this.noOfPeople = noOfPeople;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
public int getMeetingId() {
	return meetingId;
}
public void setMeetingId(int meetingId) {
	this.meetingId = meetingId;
}

}
