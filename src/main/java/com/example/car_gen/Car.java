package com.example.car_gen;

public class Car {
    private String color;
    private int year;
    private int speed=0;
    private int maxSpeed;
    private boolean isElectric;

    //In your Car class, create a constructor which
    //takes in the following parameters(String color,
    // int year, int maxSpeed)

    public Car(String color, int year, int maxSpeed) {
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }
    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {

        return speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean getIsElectric() {
        return isElectric;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setElectric(boolean electric) {
        this.isElectric = electric;
    }

    public int accelerateSpeed() {
        if (maxSpeed - speed >= 5) {


            speed+= 5;
        }
        return speed;
    }
    public int decelerateSpeed (){
        if ((maxSpeed - speed) >= 5) {
            speed -=5;
        }
        return speed;
    }
    public boolean convertToElectric(){
        if (isElectric==false){
            isElectric=true;
        }
        else{
            System.out.println("there is already electricity");

        }
        return isElectric;
    }
}

