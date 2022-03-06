package com.operators.logical;

import java.util.Scanner;

public class And {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your number between 100 to 200 : ");
        int number = in.nextInt();
        if(number <=200 && number >= 100){
            System.out.println("It works");
        }
    }
}
