package com.tka;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productid;
	private String productname;
	private double productprice;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="productdetails_productid")
	private ProductDetails productdetails;

	public Product() {
		super();
	}

	public Product(String productname, double productprice, ProductDetails productdetails) {
		super();
		this.productname = productname;
		
		this.productprice = productprice;
		this.productdetails = productdetails;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getProductprice() {
		return productprice;
	}

	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}

	public ProductDetails getProductdetails() {
		return productdetails;
	}

	public void setProductdetails(ProductDetails productdetails) {
		this.productdetails = productdetails;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", productprice=" + productprice
				+ ", productdetails=" + productdetails + "]";
	}

}
  