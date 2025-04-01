package com.tutordude.MethodOverloading.MethodOverloading;

public class MethodOverloading {

// changing the number of parameter

    public static int matches(int a,int b){
       int totalMatches = a + b;
       return totalMatches;
    }

    public static int matches(int a,int b,int c){
        int totalMatches = a + b + c;
        return totalMatches;
    }

    public static int matches(int a,int b,int c,int d){
        int totalMatches = a + b + c + d;
        return totalMatches;
    }

    // changing the type of parameter

    public static String countryName(int  number) {
        System.out.println(number + "is developed country");
        return "number";

    }

    public static String countryName(String name,int number ){
        System.out.println(name + "is developed in the position " + number );
        return name;
    }

    public static String countryName(String name,int number,int code ){
        System.out.println(name + "is developed in the position " + number + "having countryCode" + code );
        return name;
    }



    // changing the order of parameter

    public static String address(String area,int pincode){
        System.out.println("my address is" + area + "and pincode is" + pincode);
        return area;
    }

    public static String address(int pincode,String area ){
        System.out.println("my address is" + area +"and pincode is" + pincode);
        return area;
    }

}
