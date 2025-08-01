package com.tutorsdude.rivision;

public class ArrayProblem {
    public static void main(String[] args) {

        int[] array = {10,20,30,40,50,60,70,80,90,100};

        int total = 0;

        for(int i= 0; i< array.length; i++){
            total = total + array[i];
        }
        System.out.println("sum of array is :" + total);

    }
}
