package com.controlStatements;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number =in.nextInt();
        if(number < 100){
            System.out.println("Your number is less than 100");
        }
        else if (number == 100){
            System.out.println("Your number is 100");
        }
        else{
            System.out.println("Your number is greater than 100");
        }
    }
}
