package com.tutorsdude.Exeption;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    public static void main(String[] args) {

    }

    public static void employeeCheckInCheckOutDetail(EmployeeId employeeId,Verify verify,CheckIn checkIn,CheckOut checkout){





    }
//
//    public  void checkIn(Verify verify){
//        if(Verify.contains(get.validUpto)){
//        }
//
//    }

    class EmployeeId{
        private int empid;
        private String empName;
        private String dateOfJoining;
        private String validUpto;
        private String location;
        private String emptype;
        private List<Verify> verifies;

        public void setVerifies(List<Verify> verifies){
            this.verifies = verifies;
        }

        public void setEmpid(int empid) {
            this.empid = empid;
        }

        public void setEmpName(String empName) {
            this.empName = empName;
        }

        public void setDateOfJoining(String dateOfJoining) {
            this.dateOfJoining = dateOfJoining;
        }

        public void setValidUpto(String validUpto) {
            this.validUpto = validUpto;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public void setEmptype(String emptype) {
            this.emptype = emptype;
        }

        public EmployeeId(int empid, String empName, String dateOfJoining, String validUpto, String location, String emptype,List<Verify> verifies){
            this.empid = empid;
            this.empName = empName;
            this.dateOfJoining = dateOfJoining;
            this.validUpto = validUpto;
            this.location = location;
            this.emptype = emptype;
            this.verifies = verifies;
        }

        public List<Verify> getVerifies(){
            return verifies;
        }

        public int getEmpid() {
            return empid;
        }

        public String getEmpName() {
            return empName;
        }

        public String getDateOfJoining() {
            return dateOfJoining;
        }

        public String getValidUpto() {
            return validUpto;
        }

        public String getLocation() {
            return location;
        }

        public String getEmptype() {
            return emptype;
        }
    }



    static class Verify{
        private static boolean getEmpName;
        private String dateOfJoining;
        private String validUpto;
        private String emptype;
        private List<EmployeeId> verified = new ArrayList<>(Integer.parseInt(dateOfJoining, Integer.parseInt(validUpto)));
        private List<CheckIn> checkIns ;

        public boolean isVerified(List<EmployeeId> verified){
            if(Verify.getEmpName){
                System.out.println("employee succeccfully checked in");
            }else {
                System.out.println("not verified");
            }
            return false;
        }

        public List<CheckIn> getCheckIns() {
            return checkIns;
        }

        public void setCheckIns(List<CheckIn> checkIns) {
            this.checkIns = checkIns;
        }

        public String getDateOfJoining() {
            return dateOfJoining;
        }

        public void setDateOfJoining(String dateOfJoining) {
            this.dateOfJoining = dateOfJoining;
        }

        public String getValidUpto() {
            return validUpto;
        }

        public void setValidUpto(String validUpto) {
            this.validUpto = validUpto;
        }

        public String getEmptype() {
            return emptype;
        }

        public void setEmptype(String emptype) {
            this.emptype = emptype;
        }

        public Verify(String dateOfJoining, String validUpto, String emptype) {
            this.dateOfJoining = dateOfJoining;
            this.validUpto = validUpto;
            this.emptype = emptype;
        }
    }

    class CheckIn{
        private String empName;
        private int noOfDaysCheckIn;
        private String date;
        private List<CheckOut> checkOuts;
        private List<Verify> verifies = new ArrayList<>(Integer.parseInt(empName));

        public CheckIn(String empName, int noOfDaysCheckIn, String date, List<CheckOut> checkOuts) {
            this.empName = empName;
            this.noOfDaysCheckIn = noOfDaysCheckIn;
            this.date = date;
            this.checkOuts = checkOuts;
        }

        public List<CheckOut> getCheckOuts() {
            return checkOuts;
        }

        public void setCheckOuts(List<CheckOut> checkOuts) {
            this.checkOuts = checkOuts;
        }

        public String getEmpName() {
            return empName;
        }

        public void setEmpName(String empName) {
            this.empName = empName;
        }

        public int getNoOfDaysCheckIn() {
            return noOfDaysCheckIn;
        }

        public void setNoOfDaysCheckIn(int noOfDaysCheckIn) {
            this.noOfDaysCheckIn = noOfDaysCheckIn;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }


    }

    class CheckOut{
        private String empName;
        private int noOfCheckOut;
        private String date;
        private List<CheckIn>  checkIns = new ArrayList<>(Integer.parseInt(empName));

        public String getEmpName() {
            return empName;
        }

        public void setEmpName(String empName) {
            this.empName = empName;
        }

        public int getNoOfCheckOut() {
            return noOfCheckOut;
        }

        public void setNoOfCheckOut(int noOfCheckOut) {
            this.noOfCheckOut = noOfCheckOut;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public CheckOut(String empName, int noOfCheckOut, String date) {
            this.empName = empName;
            this.noOfCheckOut = noOfCheckOut;
            this.date = date;
        }
    }



}
