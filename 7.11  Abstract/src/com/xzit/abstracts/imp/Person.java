package com.xzit.abstracts.imp;

import com.xzit.abstracts.Animal;

public class Person extends AnimalAdapter{
    //private String name;

 /*   public void raiseLion(Lion lion){
        System.out.println("养狮子");
        lion.run();
    }
    public void raiseFish(Fish fish){
        System.out.println("养鱼");
        fish.run();
    }
    public void raiseCat(Cat cat){
        System.out.println("养猫");
        cat.run();
        cat.eat();
    }*/

    //多态   运行时才决定pet参数到底是什么动物
    public void raisePet(Animal pet){
        pet.run();
        pet.hunt();
    }
}
