package com.example.demo;

public class ItemDto {

	private String name;
	private int price;
	public ItemDto(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public ItemDto() {}
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
	@Override
	public String toString() {
		return "ItemDto [name=" + name + ", price=" + price + "]";
	}
	
}
