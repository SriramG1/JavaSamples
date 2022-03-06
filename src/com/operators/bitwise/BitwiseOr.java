package com.operators.bitwise;

public class BitwiseOr {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        if(a<b | a++<c){
            System.out.println("b is greater than a or c is greater than a");
            System.out.println(a);
        }
    }
}
