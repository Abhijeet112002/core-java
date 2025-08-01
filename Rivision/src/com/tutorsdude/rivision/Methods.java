package com.tutorsdude.rivision;

public class Methods {

    public static  void main(String[] args){
        sendMessage();
        call();
        call();
        sendMessage();
        sendMessage();

        address("abhijeet",22,"nippani");
        checkAge(20);
        address("jeet",17,"gangavthi");
        checkAge(17);


    }
    public static void sendMessage(){
        System.out.println("send a messgae to a employee ");

    }

    public static void call(){
        System.out.println("make a phone call to principal sir");
    }

    public static void address(String fname, int age , String location){
        System.out.println("my name is:" + fname + "my age is : " + age + "my location is:" + location);
    }

    public static void checkAge(int age){
        if(age<18){
            System.out.println("access denied, bcz you are no old enough");
        }
        else{
            System.out.println("Access granted,bcz you are old enough");
        }
    }
}
