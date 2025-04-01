package com.tutorsdude.Static.StaticExample;

public class Building {

    public static String OwnerName;
    public static int NumberOfRooms;
    public String buildingConstructionType;
    public String roomType;
    public int Price;



    public static String location;

    public static void bookCompartment(){
        System.out.println("Book Compartment");

    }

    public void confirmPrice(){
        System.out.println("Confirm Price");
    }

    static {
        OwnerName = "mr.hunter";
        NumberOfRooms = 4;
        location = "banglore";
    }
    public Building(String buildingConstructionType, String roomType, int price) {
        this.buildingConstructionType = buildingConstructionType;
        this.roomType = roomType;
        Price = price;
    }


    public void printAll(){
        System.out.println("Owner Name: " + OwnerName);
        System.out.println("Number of Rooms: " + NumberOfRooms);
        System.out.println("Building Construction Type: " + buildingConstructionType);
        System.out.println("Room Type: " + roomType);
        System.out.println("Price: " + Price);
        System.out.println("Location: " + location);
    }

}
