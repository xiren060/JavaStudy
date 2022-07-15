package com.xzit.abstracts.imp;

public class Fish extends AnimalAdapter{
    @Override
    public void run() {
        super.setName("鱼");
        System.out.print(super.getName());
        System.out.println("游");
    }
}
