package com.enumSamples;

enum WeekDays{
    SUNDAY("Hello"),MONDAY(2.0f),TUESDAY(3.0f),WEDNESDAY(4.0f),
    THURSDAY(5.0f),FRIDAY(6.0f),SATURDAY(7.0f);
    float number;
    int numberOne;
    String name;
    WeekDays(int number){
        this.numberOne =number;
    }
    WeekDays(float number){
        this.number =number;
    }
    WeekDays(String x){
        this.name=x;
    }
}
public class ConstructorOverloadingEnum {
    public static void main(String[] args) {
        WeekDays week = WeekDays.SUNDAY;

    }
}
