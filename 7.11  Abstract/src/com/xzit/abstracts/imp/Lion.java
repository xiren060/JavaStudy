package com.xzit.abstracts.imp;

import com.xzit.abstracts.Animal;

//狮子子类
public class Lion extends AnimalAdapter {

    @Override
    public void run() {
        super.setName("狮子");
        System.out.print(super.getName());
        System.out.println("跑");
    }

    //@Override
    //public void eat() {
        //System.out.println("吃");
    //}

    @Override
    public void hunt() {
        System.out.print(super.getName());
        System.out.println("捕猎");

    }
}
