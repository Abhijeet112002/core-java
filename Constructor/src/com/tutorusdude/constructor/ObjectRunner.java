package com.tutorusdude.constructor;

public class ObjectRunner{
	
	public static void main(String[] args) {
		
		Mobiles mobile = new Mobiles(35,"realme",2,"snapdargon",2);

		Mobiles mobile1= new Mobiles(45,"apple",4,"dimensity",2);

		System.out.println(mobile.battery + " " + mobile.company);

		System.out.println(mobile1.processor + " " + mobile1.simslot);
	}
}