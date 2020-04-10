package com.szu.cinian.think4_8;

public class Test {
    public static void main(String[] args){
        Factory factory = null;
        factory = new BicycleFactory();
        Transportation bicycle = factory.choose();
        bicycle.choose();

        factory = new BusFactory();
        Transportation bus = factory.choose();
        bus.choose();
    }
}
