package com.controlStatements;

public class BreakStatement {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<=n;i++){
            if(i==5){
                System.out.println("Break");
                break;
            }
            System.out.println(i);
        }
    }
}
