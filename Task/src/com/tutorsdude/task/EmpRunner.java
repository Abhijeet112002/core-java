package com.tutorsdude.task;

import com.tutorsdude.task.dto.EmployeeDto;
import com.tutorsdude.task.service.EmpService;

public class EmpRunner {

    public static void main(String[] args) {

        EmployeeDto employee = new EmployeeDto("EMP1","abhi","male",21);

        EmployeeDto emplys = new EmployeeDto("EMP2","jeet","male",21);

        EmpService emp = new EmpService();
        emp.checkIn("Emp01",employee);
        emp.checkOut("Emp01",employee);
        emp.showAllRecords();

    }
}
