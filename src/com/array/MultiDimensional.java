package com.array;

import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter row of array : ");
        int row = in.nextInt();
        System.out.println("Enter column of array : ");
        int column = in.nextInt();
        int [][]array= new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                array[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
