package com.enumSamples;

public class EnumSwitch {
    public static void main(String[] args) {
        Level level=Level.HARD;
        switch (level){
            case EASY:
                System.out.println("Level is easy");
                break;
            case MEDIUM:
                System.out.println("Level is medium");
                break;
            case HARD:
                System.out.println("Level is hard");
        }
    }
}
