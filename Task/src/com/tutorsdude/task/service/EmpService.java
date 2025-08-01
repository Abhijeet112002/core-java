package com.tutorsdude.task.service;

import com.tutorsdude.task.dto.EmployeeDto;
import com.tutorsdude.task.repository.AttendenceRepository;

import java.util.ArrayList;
import java.util.List;

public class EmpService {

    List<AttendenceRepository> result = new ArrayList<>();


    public void checkIn(String empId, EmployeeDto dto) {
        AttendenceRepository record = new AttendenceRepository(empId);
        result.add(record);
        AttendenceRepository.saveEmployeeAttendence(dto); // today
        System.out.println(empId + " checked in at " + record.checkIn);
    }

    public void checkOut(String empId, EmployeeDto dto) {
        for (AttendenceRepository record : result) {
            if (record.empId.equals(empId) && record.checkOut == null) {
                record.checkOut();
                AttendenceRepository.saveEmployeeAttendence(dto);
                System.out.println(empId + " checked out at " + record.checkOut);
                return;
            }
        }
        System.out.println("No active check-in found for " + empId);
    }

    public void showAllRecords() {
        for (AttendenceRepository data : result) {
            System.out.println(data);
        }
    }
}

//    public boolean attendence(Employee idProof, int checkInStatus,int CheckOutStatus){
//
//        //  input validation
//        if (idProof != null){
//
//            if (idProof.getEmpId().startsWith("EMP")){
//                String verified = idProof.getEmpId();
//
//                System.out.println("employee verification successful");
//
//                int  checkinStatus = idProof.getCheckIn();
//                System.out.println("checkin added");
//
//                //checkinStatus++;
//                System.out.println(checkinStatus + 1);
//
//                // for checkout
//                int checkOutstatus = idProof.getCheckOut();
//                System.out.println("checkout added");
//                System.out.println(checkOutstatus + 1);
//
//                return true;
//
//
//            }else{
//                System.out.println("id is not verified");
//                return false;
//            }
//
//        }else{
//            System.out.println("invalid id proof");
//            return false;
//        }
//    }

