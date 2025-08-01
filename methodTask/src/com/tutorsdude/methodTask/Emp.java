package com.tutorsdude.methodTask;

public class Emp {

    public boolean empAttendence(Employee empProof ,Attendence empAttendence){

        // validating inputs

        if ( empProof != null && empAttendence !=null){

                // verify employee by empId
                if(empProof.getEmpId().startsWith("EMP")){

                    String empNames = empProof.getEmpName();
                    String employeeId = empProof.getEmpId();

                    empAttendence.setCheckIn(employeeId);
                    empAttendence.setCheckIn(empNames);

                    System.out.println("Checkked In");

                    if (empNames == empProof.getEmpName()) {

                        String updatedCheckIn = null;
                        System.out.println(updatedCheckIn);
                        System.out.println("Checked Out");
                    }
                    return true;

                }else{
                    System.out.println("employee not verified");
                    return false;
                }

        }else{
            System.out.println("invalid attendence");
            return false;
        }
    }
}
