package com.example.car_gen;

//this is the class
public class Honda extends Car {
    private boolean isTurboCharged;
    //this is the constructor
    public Honda (String color, int year, int maxSpeed,boolean x){
        super(color, year, maxSpeed);
        this.isTurboCharged = x;
    }

    public boolean getIsTurboCharged(){
        return isTurboCharged;
    }
    public void setIsTurboCharged(boolean charged){
        isTurboCharged=charged;
    }
}