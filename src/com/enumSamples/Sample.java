package com.enumSamples;

import java.util.ArrayList;
class Demo {
    int age;
    String name;
    Demo(String name,int age){
        this.age=age;
        this.name=name;
    }
}
public class Sample {
    public static void main(String[] args) {
        ArrayList<Demo> demos=new ArrayList<>();
        Demo demo = new Demo("Sriram",21);
        Demo demo1 = new Demo("Ram",18);
        Demo demo2 = new Demo("Sri",22);

        demos.add(demo);
        demos.add(demo1);
        demos.add(demo2);

        System.out.println(demos.get(0).age);
        System.out.println(demos.get(1).name);
        System.out.println(demos.get(2).name);
    }
}
