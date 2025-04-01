package com.tutorsdude.MethodOveriding.MethodOverriding;

public class Department extends Hospital{
    @Override

    public void address(String location,String type,int km){
        if(km > 20){
            System.out.println("hospital location:" + location + "type of hospital:" + type + "away from:" + km );
        }
        else if (km <=20){
            System.out.println("hospital location:" + location + "type of hospital:" + type + "away from:" + km );
        }
        else{
            System.out.println("hospital location:" + location + "type of hospital:" + type + "away from:" + km );
    }
}

public void DepartmentDetails(String name,int numberOfDoctors){
    System.out.println("Department name : " + name + "number of doctors:" + numberOfDoctors);
}
}
