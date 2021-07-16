package com.airport.app.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AirportBean {
	@Value("8")
private int id;
	@Value("rajiv ghandi airport")
private String name;
	@Value("7")
private int noOfFlightsArrived;
	@Value("hyderabad")
private String location;
	@Autowired
private TerminalBean terminal;
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
public int getNoOfFlightsArrived() {
	return noOfFlightsArrived;
}
public void setNoOfFlightsArrived(int noOfFlightsArrived) {
	this.noOfFlightsArrived = noOfFlightsArrived;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "AirportBean [id=" + id + ", name=" + name + ", noOfFlightsArrived=" + noOfFlightsArrived + ", location="
			+ location + "]";
}
public TerminalBean getTerminal() {
	return terminal;
}
public void setTerminal(TerminalBean terminal) {
	this.terminal = terminal;
}

}
