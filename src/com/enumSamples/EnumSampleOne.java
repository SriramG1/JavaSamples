package com.enumSamples;


public class EnumSampleOne {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Index of EASY : "+Level.valueOf("EASY").ordinal());
        System.out.println("Index of MEDIUM : "+ Level.valueOf("MEDIUM").ordinal());
        System.out.println("Index of HARD : "+ Level.valueOf("HARD").ordinal());
    }
}
