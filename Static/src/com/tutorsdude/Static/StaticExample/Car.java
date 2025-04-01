package com.tutorsdude.Static.StaticExample;

public class Car {

    public static String brand;
    public static String manufacturer;
    public static int year;
    public int price;
    public String color;
    public int seats;

    public static void carBrand() {
        System.out.println("Car Brand");
    }

    public void carManufacturer() {
        System.out.println("Car Manufacturer");
    }

    static {
        brand = "BMW";
        manufacturer = "BMWS";
        year = 2004;
    }

    public Car(int price,String color, int seats){
        this.price = price;
        this.color = color;
        this.seats = seats;


    }

    public void printAll() {
        System.out.println("Brand: " + brand);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Seats: " + seats);

    }
}
