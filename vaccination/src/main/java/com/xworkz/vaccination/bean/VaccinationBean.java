package com.xworkz.vaccination.bean;

import java.io.Serializable;

public class VaccinationBean  implements Serializable{
private int id;
private String name;
private long dosesSent;
private String dosesAvaliabe;
private int age;
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
public long getDosesSent() {
	return dosesSent;
}
public void setDosesSent(long dosesSent) {
	this.dosesSent = dosesSent;
}
public String getDosesAvaliabe() {
	return dosesAvaliabe;
}
public void setDosesAvaliabe(String dosesAvaliabe) {
	this.dosesAvaliabe = dosesAvaliabe;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
