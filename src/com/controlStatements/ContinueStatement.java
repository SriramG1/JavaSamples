package com.controlStatements;

public class ContinueStatement {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<=n;i++){
            if(i==5){
                System.out.println("Continue");
                continue;
            }
            System.out.println(i);
        }
    }
}
