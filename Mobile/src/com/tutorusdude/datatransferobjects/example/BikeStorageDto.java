package com.tutorusdude.datatransferobjects.example;

public class BikeStorageDto {

    BikeDto[] bike = new BikeDto[10];

    public boolean saveBike(BikeDto dto){
        if(dto!= null){
            if(dto.getSpeed()>100){
                if(dto.getBikeLocation().length()>7){
                    if(dto.getNoOfGear()>4){
                        for( int i=0;i< bike.length;i++){
                            if(bike[i]==null){
                                bike[i] = dto;
                                System.out.println("data is saved");
                                return true;
                            }
                        }
                    }
                    System.out.println(" given no of gear is not valid");
                    return false;
                }
                System.out.println(" given bike location not valid");
                return false;
            }
            System.out.println(" given speed is not valid");
            return false;
        }
        System.out.println("given input in not valid");
        return false;
    }
    public BikeDto[] readall(){
        return bike;
    }
    public BikeDto findByName(String name){
        if(name!=null && name.length()>4){
            for(int i =0;i<bike.length;i++){
                if(bike[i]!=null){
                    if(bike[i].getName().equals(name)){
                        return bike[i];
                    }
                }
            }
            System.out.println("given  bike name is not present");
            return null;
        }
        System.out.println("given bike name is not valid");
        return null;
    }
}
