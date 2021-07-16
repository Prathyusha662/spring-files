package com.lg.lgapp.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RemoteBean {
	@Value("56")
	private int remoteId;
	@Value("grey")
	private String Colour;
	@Value("6")
	private int range;
	@Value("30")
	private int noOfButtons;

	public RemoteBean() {
		System.out.println(this.getClass().getSimpleName() + "created");

	}

	public int getRemoteId() {
		return remoteId;
	}

	public void setRemoteId(int remoteId) {
		this.remoteId = remoteId;
	}

	public String getColour() {
		return Colour;
	}

	public void setColour(String colour) {
		Colour = colour;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getNoOfButtons() {
		return noOfButtons;
	}

	public void setNoOfButtons(int noOfButtons) {
		this.noOfButtons = noOfButtons;
	}

	@Override
	public String toString() {
		return "RemoteBean [remoteId=" + remoteId + ", Colour=" + Colour + ", range=" + range + ", noOfButtons="
				+ noOfButtons + "]";
	}

}
