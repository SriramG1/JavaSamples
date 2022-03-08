package com.enumSamples;

interface SampleOne{
    void display();
}

enum Seasons implements SampleOne{
    WINTER,SUMMER;
    @Override
    public void display() {
        System.out.println("This is Winder");
    }
}
public class InterfaceAtEnum {
    public static void main(String[] args) {
        Seasons seasons=Seasons.WINTER;
        seasons.display();
    }
}
