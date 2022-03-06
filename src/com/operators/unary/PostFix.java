package com.operators.unary;

import java.util.Scanner;

public class PostFix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your number : ");
        int number=in.nextInt();
        System.out.println("Increment place : "+number++);
        System.out.println("After Increment : "+number);

        System.out.println("Decrement Place : "+number--);
        System.out.println("After Decrement : "+number);
    }
}
