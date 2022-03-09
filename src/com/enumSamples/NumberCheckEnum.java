package com.enumSamples;
import java.util.Scanner;

enum Errors{
    LESS_DIGITS,MORE_DIGITS,PERFECT
}
public class NumberCheckEnum {
    public static Errors check(String number){
        int digits= number.length();
        if(digits<10){
            return Errors.LESS_DIGITS;
        }
        else if(digits>10){
            return Errors.MORE_DIGITS;
        }
        else{
            return Errors.PERFECT;
        }
    }
    static void getNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your mobile number : ");
        String number = in.next();
        Errors result = check(number);
        switch (result) {
            case PERFECT -> System.out.println("Your number is perfect");
            case MORE_DIGITS -> {
                System.out.println("Your number is more than 10 digits");
                getNumber();
            }
            case LESS_DIGITS -> {
                System.out.println("Your number is less than 10 digits");
                getNumber();
            }
        }
    }
    public static void main(String[] args) {
        getNumber();
    }
}
