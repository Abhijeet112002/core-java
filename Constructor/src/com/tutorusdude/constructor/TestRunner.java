package com.tutorusdude.constructor;

public class TestRunner{
	
	public static void main(String[] args) {

		new Chargers();
		new Watch();
		new Pcs();
		

		Chargers charger = new Chargers(35,"redmi",2,"redmi",22);

		Watch watch = new Watch("boat",2000,"black","digital","magnetic");

		Pcs pcs = new Pcs("hp",2,"hp","intel",30000);



		System.out.println(charger.watt + " " +charger.company + " " + charger.chargeport + " " + charger.mobileName + " " + charger.input);

		System.out.println(watch.company + " " + watch.colour + " " + watch.cost + " " + watch.type + " " + watch.belttype);

		System.out.println(pcs.brand + " " + pcs.price + " " + pcs.pcName + " " + pcs.keyboard + " " + pcs.processor);

		
		
	}
}