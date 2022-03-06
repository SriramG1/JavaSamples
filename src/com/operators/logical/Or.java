package com.operators.logical;

import java.util.Scanner;

public class Or {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your number : ");
        int number = in.nextInt();
        if((number <=200 && number >= 100) || (number <=400 && number >= 300)){
            System.out.println("It works");
        }
    }
}
