package com.example.car_gen;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    @Test
    public void testAccelerateSpeed(){
        Assert.assertEquals(5, civic.accelerateSpeed());
    }
    Honda civic= new Honda("white",2019,210,false);
}
