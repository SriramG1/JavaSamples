package com.array;

public class JaggedArray {
    public static void main(String[] args) {
        int [][]array= {{1,2,3},{4,5,6,7,8},{4,3,6,7}};
        System.out.println("Array elements : ");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
        }
    }
}
