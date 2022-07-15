package com.xzit.test;

import com.xzit.domain.Dog;

public class DogTest {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setColor("白色");
        System.out.println("未改变颜色前是"+dog.getColor());
        dog.changeColor(dog);
        System.out.println("改变后是"+dog.getColor());

        boolean bool=dog.validateAge(56);
        System.out.println(bool?"年龄合法":"年龄不合法");

    }
}
