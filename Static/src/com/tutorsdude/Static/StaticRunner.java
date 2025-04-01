package com.tutorsdude.Static;

import com.tutorsdude.Static.StaticExample.*;

public class StaticRunner {

    public static void main(String[] args) {

        // for class Building
        
        Building.OwnerName = "TutorsDude";
        Building.NumberOfRooms = 4;
        Building.location = "Banglore";

        Building building = new Building("highLevel","Squre",50000);


        building.OwnerName = "mr.hunter";
        building.NumberOfRooms = 2;
        building.location = "Banglore";
        building.buildingConstructionType = "highLevel";
        building.Price = 500000;
        building.roomType = "squre";

        Building building2 = new Building("highLevel","rectangle",60000);

        building2.buildingConstructionType = "mediumlevel";
        building2.Price = 600000;
        building2.roomType = "rectangle";

        Building.bookCompartment();

        building.bookCompartment();
        building2.bookCompartment();

        building.printAll();
        building2.printAll();


        // for class Car

        Car.brand = "Swift";
        Car.manufacturer = "TutorsDude";
        Car.year = 2000;

        Car car = new Car(50000,"red",4);

        car.brand = "Swift";
        car.manufacturer = "TutorsDude";
        car.year = 2000;
        car.price = 500000;
        car.color = "red";
        car.seats = 4;

        Car car1 = new Car(50000,"navyBlue",5);

        car1.color = "maroon";
        car1.price = 800000;
        car1.seats = 3;

        Car.carBrand();

        car.carManufacturer();
        car1.carBrand();

        car.printAll();
        car1.printAll();

        // for class Game

        Game.coachName = "alice";
        Game.coachID = 0016;
        Game.practiceLocation = "BELGAVI";

        Game game = new Game("criket", 11,5000);

        game.name = "cricket";
        game.coachName = "alice";
        game.coachID = 0016;
        game.donationAmount = 50000;
        game.numberOfPlayers = 11;
        game.practiceLocation = "BELGAVI";

        Game game2 = new Game("criket", 11,5000);
        game2.name = "kabbadi";
        game2.donationAmount = 60000;
        game2.numberOfPlayers = 7;

        Game.gameLevel();

        game.gameLevel();
        game2.gameOver();

        game.printAll();
        game2.printAll();

        //for class EngineeringCollege

        EngineeringCollege.university = "VTU";
        EngineeringCollege.examPattern = "Mcq";
        EngineeringCollege.modeOfAdmission = "KEA";

        EngineeringCollege college = new EngineeringCollege();
        college.branch = "CSE";
        college.fees = 340000;
        college.location = "gangavathi";
        college.university = "VTU";
        college.examPattern = "Mcq";
        college.modeOfAdmission = "KEA";

        EngineeringCollege college2 = new EngineeringCollege();
        college2.branch = "ECE";
        college2.fees = 440000;
        college2.location = "koppala";

        EngineeringCollege.EngineeringCollegeList();

        college.EngineeringCollegeLocation();
        college2.EngineeringCollegeLocation();

        college.printAll();
        college2.printAll();

        // for class Business

        Business.ownerName = "hunter";
        Business.businessType = "commercial";
        Business.yearOfStarting = 2000;

        Business business = new Business("hydrabad",15,"kaliga");
        business.name = "xyz";
        business.ownerName = "hunter";
        business.businessType = "commercial";
        business.yearOfStarting = 2000;
        business.noOfEmployees = 199;
        business.address = "nippani";

        Business business2 = new Business("hydrabad",15,"kaliga");
        business2.address = "nippani";
        business2.noOfEmployees = 100;
        business2.name = "skdhkd";

        Business.businessIdea();

        business.businessStrategy();
        business2.businessStrategy();

        business.printall();
        business2.printall();



    }
}
