package com.tutordude.MethodOverloading;

import com.tutordude.MethodOverloading.MethodOverloading.MethodOverloading;

public class MethodOverloadingRunner {

    public static void main(String[] args) {

        // changing the number of parameter

        int total1 = MethodOverloading.matches(5,6);
        System.out.println(total1);

        int total2 = MethodOverloading.matches(5,6,4);
        System.out.println(total2);

        int total3 = MethodOverloading.matches(5,6,4,1);
        System.out.println(total3);

        // changing the type of parameter

        String name1 = MethodOverloading.countryName(7);
        System.out.println(name1);

        String name2 = MethodOverloading.countryName("india",7);
        System.out.println(name2);

        String name3 = MethodOverloading.countryName("india",7,91);
        System.out.println(name3);



        //changing the order of parameter

        String address1 = MethodOverloading.address("jayanagar",591219);
        System.out.println(address1);

        String address2 = MethodOverloading.address(591219,"jayanagar");
        System.out.println(address2);






    }

}
