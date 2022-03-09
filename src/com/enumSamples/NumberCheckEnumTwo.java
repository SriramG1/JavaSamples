package com.enumSamples;

import java.util.Scanner;
enum Error{
    LESS_DIGITS,MORE_DIGITS,PERFECT
}
public class NumberCheckEnumTwo {
    public static void check() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your mobile number : ");
        String number = in.next();
        Error result;
        int digits = number.length();
        if (digits < 10) {
            result = Error.LESS_DIGITS;
        } else if (digits > 10) {
            result = Error.MORE_DIGITS;
        } else {
            result = Error.PERFECT;
        }
        switch (result) {
            case PERFECT -> System.out.println("Your number is perfect");
            case MORE_DIGITS -> {
                System.out.println("Your number is less than 10 digits");
                check();
            }
            case LESS_DIGITS -> {
                System.out.println("Your number is more than 10 digits");
                check();
            }
        }
    }
    public static void main (String[] args){
        check();
    }
}
