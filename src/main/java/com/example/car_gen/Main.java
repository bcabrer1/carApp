package com.example.car_gen;

public class Main {


    public static void main(String[] args) {
        Honda civic= new Honda("white",2020,200,false);
        Lexus rx350= new Lexus("tan",2019, 150, true);
        Toyota supra= new Toyota("black",2021,220,false);
        System.out.println(civic.getColor());
        System.out.println(rx350.getColor());
        System.out.println(supra.getColor());
        System.out.println(civic.accelerateSpeed());
        System.out.println(rx350.accelerateSpeed());
        System.out.println(supra.accelerateSpeed());
        System.out.println(civic.decelerateSpeed());
        System.out.println(rx350.decelerateSpeed());
        System.out.println(supra.decelerateSpeed());
        System.out.println(civic.convertToElectric());
        System.out.println(rx350.convertToElectric());
        System.out.println(supra.convertToElectric());


    }

}
