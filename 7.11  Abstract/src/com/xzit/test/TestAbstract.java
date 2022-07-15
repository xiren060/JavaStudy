package com.xzit.test;

import com.xzit.abstracts.Animal;
import com.xzit.abstracts.MammalAnimal;
import com.xzit.abstracts.imp.Cat;
import com.xzit.abstracts.imp.Fish;
import com.xzit.abstracts.imp.Lion;

public class TestAbstract {
    public static void main(String[] args) {
        //Animal animal1=new Animal(); //抽象类自身不能够实例化，必须依赖子类进行创建
        Animal animal2=new Lion();
        Animal animal4=new Fish();
        Animal animal5=new Cat();

        //Animal animal3=new MammalAnimal();

        animal2.run();
        animal4.run();
        animal5.run();
        animal5.eat();



    }
}
