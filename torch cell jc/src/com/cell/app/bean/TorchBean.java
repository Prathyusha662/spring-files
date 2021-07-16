package com.cell.app.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TorchBean {
	@Value("56")
	private int id;
	@Value("flambea")
	private String name;
	@Value("560")
	private int price;
	@Autowired
	private CellBean cell;

	public TorchBean() {
		System.out.println(this.getClass().getSimpleName() + "created");
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public CellBean getCell() {
		return cell;
	}

	public void setCell(CellBean cell) {
		this.cell = cell;
	}

	@Override
	public String toString() {
		return "TorchBean [id=" + id + ", name=" + name + ", price=" + price + ", cell=" + cell + "]";
	}

}
