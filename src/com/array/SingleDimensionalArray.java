package com.array;


import java.util.Scanner;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your array length : ");
        int length=in.nextInt();
        int []array=new int[length];
        System.out.println("Enter your array element : ");
        for(int i=0;i<length;i++){
            array[i]=in.nextInt();
        }
        System.out.println("Your array elements is : ");
        for(int i=0;i<length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
