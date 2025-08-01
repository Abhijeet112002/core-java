package com.tutorsdude.task.dto;

public class EmployeeDto {

    private String empId;
    private String empName;
    private String gender;
    private int age;
//    private int checkIn = 0;
//    private int checkOut = 0;

    public EmployeeDto(String empId, String empName, String gender, int age) {
        this.empId = empId;
        this.empName = empName;
        this.gender = gender;
        this.age = age;
//        this.checkIn = checkIn;
//        this.checkOut = checkOut;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public int getCheckIn(){
//        return checkIn;
//    }
//    public void setCheckIn( int checkIn){
//        this.checkIn = checkIn;
//    }
//    public int getCheckOut(){
//        return checkOut;
//    }
//    public void setCheckout( int checkOut){
//        this.checkOut = checkIn;
//    }



}
