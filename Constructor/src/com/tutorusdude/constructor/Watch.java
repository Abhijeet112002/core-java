package com.tutorusdude.constructor;

public class Watch{
	
	String company;
	int cost;
	String colour;
	String type;
	String belttype;

	public Watch(){

		System.out.println("i have boat Watch");

	}

	public Watch(String company,int cost,String colour,String type,String belttype){
		
		this.company = company;
		this.cost = cost;
		this.colour = colour;
		this.type = type;
		this.belttype = belttype;



	}

}