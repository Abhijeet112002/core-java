package com.tutorsdude.hospital.Hospital;

public class Patient {

    public String name;
    public Disease[] disease;
    public int age;
    public PatientAddress[] patientaddress;

    public void printall(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + patientaddress);
        System.out.println("Disease :" + disease);

    }


}
