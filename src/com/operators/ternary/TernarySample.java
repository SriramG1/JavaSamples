package com.operators.ternary;

import java.util.Scanner;

public class TernarySample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your age : ");
        int age=in.nextInt();
        String check=(age>=18)?"Eligible":"Not Eligible";
        System.out.println(check);
    }
}
