package com.operators.unary;

import java.util.Scanner;

public class PreFix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your number : ");
        int number=in.nextInt();
        System.out.println("Increment place (++) : "+ ++number);
        System.out.println("Decrement place (--) : "+ --number);

        System.out.println("enter your number : ");
        int numberOne = in.nextInt();
        System.out.println("(+) :  "+ +numberOne);
        System.out.println("(-) : "+ -numberOne);
        System.out.println("(~) : "+ ~numberOne);
        System.out.println("(!) : "+ !true);

    }
}
