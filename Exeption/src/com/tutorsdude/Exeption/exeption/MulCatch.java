package com.tutorsdude.Exeption.exeption;

public class MulCatch {

    public static void main(String[] args) {

        int a = 16;

        try{
            int data = 10/0;
            System.out.println("gives an arithmetic exeption");

            String value = "abc";
            int number = Integer.parseInt(value);
            System.out.println("Number: " + number);

            Object obj = new String("Hello");
            Integer num = (Integer) obj;

        }catch (ArithmeticException e){
            System.out.println("error:" + e);

        }catch (NumberFormatException e){
            System.out.println("invalid number format:" + e);

        }catch (ClassCastException e){
            System.out.println("class cast exception : " + e);
        }

    }
}
