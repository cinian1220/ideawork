package com.szu.cinian.think4_8;


public class BusFactory implements Factory {
    public  Transportation choose(){
        return new Bus();
    }
}
//具体的工厂子类，分别为每个具体的产品类创建不同的工厂子类