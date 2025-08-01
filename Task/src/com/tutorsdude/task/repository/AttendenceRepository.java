package com.tutorsdude.task.repository;

import com.tutorsdude.task.dto.EmployeeDto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AttendenceRepository {

    public String empId;
    public LocalDateTime checkIn;
    public LocalDateTime checkOut;

    static List<EmployeeDto> result = new ArrayList<EmployeeDto>();

    public static boolean saveEmployeeAttendence(EmployeeDto dto){
        if (dto != null){
            result.add(dto);
            return true;
        }
        else {
            System.out.println(" Employee details not saved");
            return false;
        }
    }

    public AttendenceRepository(String empId){
        this.empId = empId;
        this.checkIn = LocalDateTime.now();
    }

    public void checkOut(){
        this.checkOut = LocalDateTime.now();
    }


    public String toString() { // today
        return "EmpID = " + empId + " Check-In = " + checkIn +   " Check-Out = " + checkOut;

    }
}
