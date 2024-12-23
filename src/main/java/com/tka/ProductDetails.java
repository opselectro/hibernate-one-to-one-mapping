package com.tka;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductDetails {

	@Id
	int productid;

	String manufacturer;
	String warrenty;

	public ProductDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDetails(int productid,String manufacturer, String warrenty) {
		super();
		this.productid=productid;
		this.manufacturer = manufacturer;
		this.warrenty = warrenty;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getWarrenty() {
		return warrenty;
	}

	public void setWarrenty(String warrenty) {
		this.warrenty = warrenty;
	}

}