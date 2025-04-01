package com.tutorsdude.Static.StaticExample;

public class Game {
    public String name;
    public static String coachName;
    public static int coachID;
    public int numberOfPlayers;
    public static String practiceLocation;
    public int donationAmount;

    public static void gameLevel(){
        System.out.println("Game Level");
    }

    public  void gameOver(){
        System.out.println("Game Over");
    }

    static {
        coachName = "l manjunath";
        coachID = 002;
        practiceLocation = "pakistan";
    }

    public Game(String name,int numberOfPlayers,int donationAmount){
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.donationAmount = donationAmount;
    }

    public void printAll() {
        System.out.println("Name: " + name);
        System.out.println("Coach: " + coachName);
        System.out.println("Coach ID: " + coachID);
        System.out.println("Number of Players: " + numberOfPlayers);
        System.out.println("Practice Location: " + practiceLocation);
        System.out.println("Donation Amount: " + donationAmount);

    }
}
