package com.szu.cinian.think4_8;

public class BicycleFactory implements Factory{
    public  Transportation choose() {
        return new Bicycle();
    }
}
//