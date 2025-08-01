package com.tutorsdude.rivision;

public class ReturnType {

    public static void main(String[] args) {
       int  addedValue = add(5,7);
        System.out.println(addedValue);
    }

    public static int add(int a, int b){
         int addedValue = a + b;
         return addedValue;
    }
}
