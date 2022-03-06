package com.enumSamples;

enum Direction{
    EAST{
        void display(){
            System.out.println("Message from display method inside east");
        }
    },
    WEST{
        void display(){
            System.out.println("Message from display method inside west");
        }
    },
    SOUTH {
        @Override
        void display() {
            System.out.println("Message from display method inside south");
        }
    },
    NORTH {
        @Override
        void display() {
            System.out.println("Message from display method inside north");
        }
    };
    abstract void display();
}
public class AbstractMethodEnum {
    public static void main(String[] args) {
        Direction obj=Direction.EAST;
        obj.display();
        Direction obj1=Direction.SOUTH;
        obj1.display();
        Direction obj2=Direction.WEST;
        obj2.display();
        Direction obj3=Direction.NORTH;
        obj3.display();
    }
}
