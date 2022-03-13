package com.enumSamples;

enum WeekDays{
    SUNDAY("Ram"),MONDAY(2.0f),TUESDAY(3.0f),WEDNESDAY(4.0f),
    THURSDAY(10),FRIDAY("Sri",6.0f),SATURDAY(7.0f);
    float number;
    int numberOne;
    String name;
    WeekDays(int number){
        this.numberOne =number;
    }
    WeekDays(float number){
        this.number =number;
    }
    WeekDays(String str){
        this.name=str;
    }
    WeekDays(String str,float number){
        this.name=str;
        this.number=number;
    }
}
public class ConstructorOverloadingEnum {
    public static void main(String[] args) {
        WeekDays week = WeekDays.SUNDAY;

    }
}
