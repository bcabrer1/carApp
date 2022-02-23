package com.example.car_gen;

public class Lexus extends Car {
    private boolean hasLeatherSeats;
    public Lexus (String color, int year, int maxSpeed,boolean x){
        super(color,year,maxSpeed);
        this.hasLeatherSeats = x;

    }
    public boolean getHasLeatherSeats(){
        return hasLeatherSeats;
    }

    public void setHasLeatherSeats(boolean hasLeatherSeats) {
        this.hasLeatherSeats = hasLeatherSeats;
    }
}