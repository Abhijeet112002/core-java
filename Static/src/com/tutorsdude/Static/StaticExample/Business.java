package com.tutorsdude.Static.StaticExample;

public class Business {

    public static String ownerName;
    public static int yearOfStarting;
    public String address;
    public int noOfEmployees;
    public static String businessType;
    public String name;

    public static void businessIdea(){
        System.out.println("Business Idea");
    }

    public void businessStrategy(){
        System.out.println("Business Strategy");
    }

    static{
        ownerName = "abhijeet";
        yearOfStarting = 5;
        businessType = "commercial";
    }

    public Business(String address,int noOfEmployee,String name){
        this.address = address;
        this.noOfEmployees = noOfEmployee;
        this.name = name;
    }

    public void printall(){
        System.out.println("OwnerName: " + ownerName);
        System.out.println("yearOfStarting: " + yearOfStarting);
        System.out.println("address: " + address);
        System.out.println("noOfEmployees: " + noOfEmployees);
        System.out.println("businessType: " + businessType);
        System.out.println("name: " + name);

    }




}
