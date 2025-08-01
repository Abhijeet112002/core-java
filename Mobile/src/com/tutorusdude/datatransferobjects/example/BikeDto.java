package com.tutorusdude.datatransferobjects.example;

public class BikeDto {

    private String name;
    private int noOfWheels;
    private String bikeLocation;
    private int noOfGear;
    private int speed;
    private String ownerName;

    public BikeDto(String name,int noOfWheels,String bikeLocation,int noOfGear,int speed,String ownerName){
        this.name = name;
        this.noOfWheels = noOfWheels;
        this.bikeLocation = bikeLocation;
        this.noOfGear = noOfGear;
        this.speed = speed;
        this.ownerName = ownerName;
    }

    // getters

    public String getName(){
        return name;
    }
    public int getNoOfWheels(){
        return noOfWheels;
    }
    public String getBikeLocation(){
        return bikeLocation;
    }
    public int getNoOfGear(){
        return noOfGear;
    }
    public int getSpeed(){
        return speed;
    }
    public String getOwnerName(){
        return ownerName;
    }

    // setters

    public void setName(String name){
        this.name = name;
    }
    public void setNoOfWheels(int noOfWheels){
        this.noOfWheels = noOfWheels;
    }

    public void setBikeLocation(String bikeLocation){
        this.bikeLocation = bikeLocation;
    }
    public void setNoOfGear( int noOfGear){
        this.noOfGear = noOfGear;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }




}
