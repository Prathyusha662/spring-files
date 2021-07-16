package com.cell.app.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CellBean {
	@Value("7")
	private int id;
	@Value("everyday")
	private String CellName;
	@Value("6.7")
	private Float sizeOfCell;
	@Value("15")
	private int price;

	public CellBean() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCellName() {
		return CellName;
	}

	public void setCellName(String cellName) {
		CellName = cellName;
	}

	public Float getSizeOfCell() {
		return sizeOfCell;
	}

	public void setSizeOfCell(Float sizeOfCell) {
		this.sizeOfCell = sizeOfCell;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CellBean [id=" + id + ", CellName=" + CellName + ", sizeOfCell=" + sizeOfCell + ", price=" + price
				+ "]";
	}

}
