package com.tutorsdude.Encapsulation;

import com.tutorsdude.Encapsulation.object.Mobile;

import java.sql.SQLOutput;

public class Runner {

    public static void main(String[] args) {

        Mobile mob = new Mobile();

        mob.setMobileCharging((byte)23);
        System.out.println(mob.getMobileCharging());

        mob.setNoOfSimSlots((byte) 2);
        System.out.println(mob.getNoOfSimSlots());

        mob.setCameraQualityInMp((byte)50);
        System.out.println(mob.getCameraQualityInMp());

        mob.setNoOfButtons((byte)3);
        System.out.println(mob.getNoOfButtons());

        mob.setRam((byte)8);
        System.out.println(mob.getRam());

        mob.setAndroidVersion((byte) 15);
        System.out.println(mob.getAndroidVersion());

        mob.setWeight((short)500);
        System.out.println(mob.getWeight());

        mob.setInternalStorage((short)256);
        System.out.println(mob.getInternalStorage());

        mob.setManufacturingYear((short)2000);
        System.out.println(mob.getManufacturingYear());

        mob.setMobileNumber(1234567890);
        System.out.println(mob.getMobileNumber());

        mob.setPrice(15000);
        System.out.println(mob.getPrice());

        mob.setManufacturingPerYear(30000);
        System.out.println(mob.getManufacturingPerYear());

        mob.setNoOfDistributers(1000);
        System.out.println(mob.getNoOfDistributers());

        mob.setRechargePlan(599);
        System.out.println(mob.getRechargePlan());

        mob.setMobileCompany("xiomi");
        System.out.println(mob.getMobileCompany());

        mob.setBrand("redmi");
        System.out.println(mob.getBrand());

        mob.setProcessor("snapdragon");
        System.out.println(mob.getProcessor());

        mob.setOwnerName("hunter");
        System.out.println(mob.getOwnerName());

        mob.setBatteryCapacity("1234mah");
        System.out.println(mob.getBatteryCapacity());

        mob.setColor("red");
        System.out.println(mob.getColor());

        mob.setManufacturingLocation("delhi");
        System.out.println(mob.getManufacturingLocation());

        mob.setOsVersion((float)2.4);
        System.out.println(mob.getOsVersion());

        mob.setSellingRatio((float)4.5);
        System.out.println(mob.getSellingRatio());

        mob.setProfitRatio((float)7.4);
        System.out.println(mob.getProfitRatio());

        mob.setUsbType('C');
        System.out.println(mob.getUsbType());

        mob.setSeries('a');
        System.out.println(mob.getSeries());

        mob.setProcessorIsGood(true);
        System.out.println(mob.getProcessorIsGood());

        mob.setMobilePriceIsHigh(false);
        System.out.println(mob.getMobilePriceIsHigh());

        mob.setItsChineesCompany(true);
        System.out.println(mob.getItsChineesCompany());

        mob.setCameraQualityIsWorst(true);
        System.out.println(mob.getCameraQualityIsWorst());

    }
}
