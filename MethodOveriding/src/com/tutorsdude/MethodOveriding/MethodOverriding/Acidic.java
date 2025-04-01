package com.tutorsdude.MethodOveriding.MethodOverriding;

public class Acidic extends PhValue{
    @Override

    public void phValue(String type,int value){
        if(value>7){
            System.out.println("type of mixtures:" + type + "phValue:" + value);
        }
        else if(value<7){
            System.out.println("type of mixtures:" + type + "phValue:" + value);
        }
        else{
            System.out.println("type of mixtures:" + type + "phValue:" + value);
        }
    }
}
