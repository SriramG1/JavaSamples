package com.enumSamples;
interface DemoOne{
    enum Directions {
        EAST, SOUTH, WEST, NORTH
    }
}
public class InsideInterface implements DemoOne {
    public static void main(String[] args) {
        Directions obj1=Directions.EAST;
        System.out.println(obj1);
        Directions obj2=Directions.SOUTH;
        System.out.println(obj2);
        Directions obj3=Directions.WEST;
        System.out.println(obj3);
        Directions obj4=Directions.NORTH;
        System.out.println(obj4);
    }
}
