package com.tutorsdude.rivision;

public class Array {
    public static void main(String[] args) {

        int[] age = {10,20,30,40,50,60,70,80,90,45}; // declaration of an array by using a literal method

        age[3] = 67; // reasigning a value by using index number
        age[2] = 89;
        age[9] = 99;

        System.out.println(age[0]);  //printing without using a loop
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);
        System.out.println(age[4]);
        System.out.println(age[5]);
        System.out.println(age[6]);
        System.out.println(age[7]);
        System.out.println(age[8]);
        System.out.println(age[9]);


        int[] marks = new int[4]; // creating a array by using new keyword method

        marks[0] = 35;
        marks[1] = 40;
        marks[2] = 50;
        marks[3] = 60;

        System.out.println(marks[0]);  //printing without using a loop
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        int[] id = {1,2,3,4,5,6,7,8,9,0};

        for(int i=0; i<10;i++){  // from left to right
            System.out.println(id[i]);
        }
        for(int i=10; i<0;i--){  // from right to left
            System.out.println(id[i]);
        }
        for(int i=4; i<10;i++){  // from middle to right
            System.out.println(id[i]);
        }

        for(int i=4; i<0;i--){  // from middle to left
            System.out.println(id[i]);
        }

        for(int i=0; i<10;i=i+2){  // skipping one element
            System.out.println(id[i]);
        }

        



    }
}
