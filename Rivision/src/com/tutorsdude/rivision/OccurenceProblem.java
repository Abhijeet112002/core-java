package com.tutorsdude.rivision;

public class OccurenceProblem {
    public static void main(String[] args) {

        int[] arrayValues = {2,3,2,3,4,3,2,4};

        int arrayResult = findOccurence(arrayValues,2);
        System.out.println("No repeated :" + arrayResult);

    }

    public static int findOccurence( int[] arrayValue, int input){
        int count = 0;
        for( int i=0; i< arrayValue.length; i++){
            if(arrayValue[i] == input) {
                count++;
            }
        }
        return count;
    }
}
