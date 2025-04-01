package com.tutorsdude.MethodOveriding;

import com.tutorsdude.MethodOveriding.MethodOverriding.*;

public class MethodOverridingRunner {

    public static void main(String[] args) {
        Vehicle veh = new Vehicle();
        veh.vehicleDetails("Bmw",1998);
        veh.sendMessage("hello");

        Bmw bmw = new Bmw();
        bmw.vehicleDetails("swift",2004);
        bmw.sendMessage("hi");

        Hospital hos = new Hospital();
        hos.address("gangavathi","government",15);

        Department dept = new Department();
        dept.address("koppala","private",25);
        dept.DepartmentDetails("mr.hunter",25);

        PhValue ph = new PhValue();
        ph.phValue("acidic",5);

        Acidic acidic = new Acidic();
        acidic.phValue("basis",8);
    }
}
