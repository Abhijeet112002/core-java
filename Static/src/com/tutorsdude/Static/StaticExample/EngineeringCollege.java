package com.tutorsdude.Static.StaticExample;

public class EngineeringCollege {

    public String branch;
    public int fees;
    public static String university;
    public String location;
    public static String examPattern;
    public static String modeOfAdmission;

    public static void EngineeringCollegeList() {
        System.out.println("EngineeringCollegeList");
    }

    public void EngineeringCollegeLocation() {
        System.out.println("EngineeringCollegeLocation");
    }

    public void printAll() {
        System.out.println("Branch: " + branch);
        System.out.println("Fees: " + fees);
        System.out.println("University: " + university);
        System.out.println("Location: " + location);
        System.out.println("Exam Pattern: " + examPattern);
        System.out.println("Mode of Admission: " + modeOfAdmission);

    }


}
