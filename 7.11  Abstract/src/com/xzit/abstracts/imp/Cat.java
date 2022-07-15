package com.xzit.abstracts.imp;

public class Cat extends AnimalAdapter{


    @Override
    public void run() {
        super.setName("猫");
        System.out.print(getName());
        System.out.println("跑");
    }

    @Override
    public void eat() {
        System.out.print(getName());
        System.out.println("吃");
    }
}
