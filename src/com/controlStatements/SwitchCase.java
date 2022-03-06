package com.controlStatements;


import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("enter your Day : ");
        int day=in.nextInt();
        switch (day){
            case 1:
                System.out.println("your day is Sunday");
                break;
            case 2:
                System.out.println("your day is Monday");
                break;
            case 3:
                System.out.println("your day is Tuesday");
                break;
            case 4:
                System.out.println("your day is Wednesday");
                break;
            case 5:
                System.out.println("your day is Thursday");
                break;
            case 6:
                System.out.println("your day is Friday");
                break;
            case 7:
                System.out.println("your day is Saturday");
                break;
            default:
                System.out.println("Enter valid day");
        }
    }
}
