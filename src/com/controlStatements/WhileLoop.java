package com.controlStatements;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your limit for natural numbers : ");
        int limit=in.nextInt();
        int i=1;
        while(i<=limit){
            System.out.println(i+" ");
            i++;
        }
    }
}
