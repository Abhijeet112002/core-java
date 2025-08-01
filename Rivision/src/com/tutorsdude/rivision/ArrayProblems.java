package com.tutorsdude.rivision;

public class ArrayProblems {

    public static void main(String[] args) {
        int[] array = { 10,37,37,38,27,49,};

        int result = sumOfArray(array);
        System.out.println(" sum of array is :" + result);

    }

    public static int sumOfArray( int[] array){
        int total = 0;
        for(int i=0;i<array.length;i++){
            total = total + array[i];
        }
        return total;
    }
}
