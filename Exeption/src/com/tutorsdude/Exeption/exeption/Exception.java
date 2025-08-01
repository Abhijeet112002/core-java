package com.tutorsdude.Exeption.exeption;

import java.security.SecureRandom;

public class Exception {
    public static void main(String[] args) {

        System.out.println(generateOtp());

        // arithmetic exception handling

        int a = 16;
        try{
            int data = 10/0;
            System.out.println("gives us arithmetic exeption");
        }catch (java.lang.Exception e){
            System.out.println("Error:" + e);
        }
        System.out.println("program execution is continues");

            // number format exception handling
        try {
            String value = "abc";
            int number = Integer.parseInt(value);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e);
        }

        System.out.println("still execution is continues");

        //class cast exception handling

        try {
            Object obj = new String("Hello");  // string is subclass of object
            Integer num = (Integer) obj; // converting obj which is string into an integer
        } catch (ClassCastException e) {
            System.out.println("Error: Invalid type cast - " + e);
        }

        System.out.println("still continues the execution of java code");

    }


    public static int generateOtp(){
        SecureRandom secureRandom = new SecureRandom();
        int otp = 100000 + secureRandom.nextInt(23093);
        return otp;
    }
}
