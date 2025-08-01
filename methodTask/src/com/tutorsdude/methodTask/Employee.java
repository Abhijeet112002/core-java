package com.tutorsdude.methodTask;

public class Employee {

    private String empId;
    private String empName;
    private int  empAge;
    private String gender;
//    private int checkedInAttendence;
//    private int checkedOutAttendence;


    public Employee(String empId, String empName, int empAge, String gender) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.gender = gender;
//        this.checkedInAttendence = checkedInAttendence;
//        this.checkedOutAttendence = checkedOutAttendence;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
//
//    public int getCheckedInAttendence() {
//        return checkedInAttendence;
//    }
//
//    public void setCheckedInAttendence(int checkedInAttendence) {
//        this.checkedInAttendence = checkedInAttendence;
//    }
//
//    public int getCheckedOutAttendence() {
//        return checkedOutAttendence;
//    }
//
//    public void setCheckedOutAttendence(int checkedOutAttendence) {
//        this.checkedOutAttendence = checkedOutAttendence;
//    }
}
