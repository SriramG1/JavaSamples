package com.enumSamples;

interface SampleOne{
    void display();
}

enum Seasons implements SampleOne{
    WINDER,SUMMER;
    @Override
    public void display() {
        System.out.println("This is Winder");
    }
}
public class InterfaceAtEnum {
    public static void main(String[] args) {
        Seasons seasons=Seasons.WINDER;
        seasons.display();
    }
}
