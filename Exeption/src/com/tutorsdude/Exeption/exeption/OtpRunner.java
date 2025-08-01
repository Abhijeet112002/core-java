package com.tutorsdude.Exeption.exeption;

import java.security.SecureRandom;

public class OtpRunner {
    public static void main(String[] args) {

        System.out.println(generateOtp());
        System.out.println(generateOtp());

        System.out.println(getOtp());

        System.out.println(otp());

        System.out.println(generatingOtp());
        System.out.println(generatingOtp());
        System.out.println(generatingOtp());



    }
    public static int generateOtp(){
        SecureRandom secureRandom = new SecureRandom();
        int otp = 1000 + secureRandom.nextInt(10);
        return otp;
    }

    public static int getOtp(){
        SecureRandom secureRandom = new SecureRandom();
        int otp = 1000 + secureRandom.nextInt(1022);
        return otp;
    }

    public static int otp(){
        SecureRandom secureRandom = new SecureRandom();
        int otp = 1000 + secureRandom.nextInt(111100);
        return otp;
    }


    public static int generatingOtp(){
        SecureRandom secureRandom = new SecureRandom();
        int otps = 10000 + secureRandom.nextInt(100);
        return otps;
    }
}
