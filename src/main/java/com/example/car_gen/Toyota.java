package com.example.car_gen;

public class Toyota extends Car {
    private boolean greatGasMileage;

    public Toyota (String color, int year, int maxSpeed,boolean x){
        super(color,year,maxSpeed);
        this.greatGasMileage = x;
    }


    public boolean getGreatGasMileage() {
        return greatGasMileage;
    }

    public void setGreatGasMileage(boolean greatGasMileage) {
        this.greatGasMileage = greatGasMileage;
    }
}
