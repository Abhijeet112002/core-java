package com.tutorusdude.constructor;

public class Constructor{
	String pcName;
	int keyboard;
	String brand;
	String processor;
	int price;

	public Pcs(){
		System.out.println("pcs are best for video gaming");
	}

	public Pcs(String pcName,int keyboard,String brand,String processor,int price){

		this.pcName = pcName;
		this.keyboard = keyboard;
		this.brand = brand;
		this.processor = processor;
		this.price = price;



	}
}
