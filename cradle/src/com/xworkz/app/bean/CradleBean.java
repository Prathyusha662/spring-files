package com.xworkz.app.bean;

public class CradleBean {
private int id;
private boolean  autoSwing;
private  String width;
private int age;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public boolean isAutoSwing() {
	return autoSwing;
}
public void setAutoSwing(boolean autoSwing) {
	this.autoSwing = autoSwing;
}
public String getWidth() {
	return width;
}
public void setWidth(String width) {
	this.width = width;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "CradleBean [id=" + id + ", autoSwing=" + autoSwing + ", width=" + width + ", age=" + age + "]";
}
public void displayPlanet() {
	System.out.println("display plaNET IS CALLED");
	System.out.println(getId() + "  " + isAutoSwing() + "  " + getWidth() + "   " +getAge());
}
}
