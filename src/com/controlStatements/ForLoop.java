package com.controlStatements;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your limit for natural numbers : ");
        int limit=in.nextInt();
        for(int i=1;i<=limit;i++){
            System.out.print(i+" ");
        }
    }
}
