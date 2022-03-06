package com.operators.arithmatic;

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your first number : ");
        int numberOne=in.nextInt();
        System.out.println("Enter Your first number : ");
        int numberTwo=in.nextInt();
        System.out.println("Your subtraction value is : "+(numberOne-numberTwo));
    }
}
