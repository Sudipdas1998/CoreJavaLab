package com.productretailer;

public class Product {

	// instance variables
	private int id;

	private String itemName;

	private String Brand;

	private double Quantity;

	private double pricePerQuantity;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String itemName, String brand, double quantity, double pricePerQuantity) {
		super();
		this.id = id;
		this.itemName = itemName;
		Brand = brand;
		Quantity = quantity;
		this.pricePerQuantity = pricePerQuantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public double getQuantity() {
		return Quantity;
	}

	public void setQuantity(double quantity) {
		Quantity = quantity;
	}

	public double getPricePerQuantity() {
		return pricePerQuantity;
	}

	public void setPricePerQuantity(double pricePerQuantity) {
		this.pricePerQuantity = pricePerQuantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", itemName=" + itemName + ", Brand=" + Brand + ", Quantity=" + Quantity
				+ ", pricePerQuantity=" + pricePerQuantity + "]";
	}

}