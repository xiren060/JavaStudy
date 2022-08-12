package com.animaldemo;

public class SharPei extends Dog {

    //方法重写


    @Override
    public void eat() {
        super.eat();
        System.out.println("沙皮狗啃骨头");
    }

}
