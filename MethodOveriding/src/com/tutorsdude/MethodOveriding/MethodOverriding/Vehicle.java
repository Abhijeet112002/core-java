package com.tutorsdude.MethodOveriding.MethodOverriding;

public class Vehicle  {

    public void vehicleDetails(String name,int year) {
        if (year < 2000) {
            System.out.println("vehicle name:" + name + "year of manufacture :" + year);
        } else {
            System.out.println("vehicle name:" + name + "year of manufacture :" + year);
        }
    }
        public void sendMessage(String message){
            System.out.println(message);
        }
}
