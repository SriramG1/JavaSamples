package com.enumSamples;

public class Initialize {
    enum Levels {
        EASY(5),MEDIUM(10),HARD(15);
        final int number;
        Levels(int number){
            this.number=number;
        }
    }
    public static void main(String[] args) {
        for(Levels lvl:Levels.values()){
            System.out.println(lvl+"  "+lvl.number);
        }
    }
}
