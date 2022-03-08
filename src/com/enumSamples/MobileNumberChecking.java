package com.enumSamples;

import java.util.Scanner;

public class MobileNumberChecking {
    public static void checkPhoneNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your phone number : ");
        String number = in.next();
        int length=number.length();
        if(length<10){
            System.out.println("Your number is less than ten digits ");
            checkPhoneNumber();
        }
        else if(length>10){
            System.out.println("Your number is greater than ten digits ");
            checkPhoneNumber();
        }
        else {
            System.out.println("Your number is perfect ");
        }
    }
    public static void main(String[] args) {
        checkPhoneNumber();
    }
}
