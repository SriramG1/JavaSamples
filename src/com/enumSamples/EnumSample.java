package com.enumSamples;

enum Level {
    EASY,MEDIUM,HARD
}
public class EnumSample {
    public static void main(String[] args) {
        for(Level lvl:Level.values()){
            System.out.println(lvl);
        }

        System.out.println();
        System.out.println(Level.valueOf("EASY"));
        System.out.println(Level.valueOf("MEDIUM"));
        System.out.println(Level.valueOf("HARD"));

        System.out.println();
        Level one=Level.EASY;
        Level two=Level.MEDIUM;
        Level three=Level.HARD;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
