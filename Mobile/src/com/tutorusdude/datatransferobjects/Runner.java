package com.tutorusdude.datatransferobjects;

import com.tutorusdude.datatransferobjects.example.BikeDto;
import com.tutorusdude.datatransferobjects.example.BikeStorageDto;

public class Runner {
    public static void main(String[] args) {

        BikeDto bikeDto = new BikeDto("unicorn",4,"gangavathi",5,101,"siddalinga k");

        BikeStorageDto bikeStorageDto = new BikeStorageDto();

        bikeStorageDto.saveBike(bikeDto);

//        BikeDto[] names = bikeStorageDto.readall();
//
//        for(int i=0;i<names.length;i++){
//            System.out.println(names[i].getSpeed());
//        }

        BikeDto findName = bikeStorageDto.findByName("unicorn");
        System.out.println("name of bike is:"+ findName.getName());

        System.out.println("number of wheels:"+ findName.getNoOfWheels());

        System.out.println("bike location :"+ findName.getBikeLocation());

        System.out.println("no of gear :" + findName.getNoOfGear());

        System.out.println("speed of bike :" + findName.getSpeed());

        System.out.println("ownwer name : " + findName.getOwnerName());
    }
}
