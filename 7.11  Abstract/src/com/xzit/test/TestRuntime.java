package com.xzit.test;

import com.xzit.abstracts.Animal;
import com.xzit.abstracts.imp.Cat;
import com.xzit.abstracts.imp.Fish;
import com.xzit.abstracts.imp.Lion;
import com.xzit.abstracts.imp.Person;

public class TestRuntime {
    public static void main(String[] args) {

    /*Cat cat=new Cat();
    Lion lion=new Lion();*/

    Person xiaocui=new Person();
    Animal cat=new Cat();
    Animal lion=new Lion();
    Animal fish=new Fish();

    //运行时多态
    //xiaocui.raisePet(fish);
    xiaocui.raisePet(lion);
    //xiaocui.raisePet(cat);

    }
}
