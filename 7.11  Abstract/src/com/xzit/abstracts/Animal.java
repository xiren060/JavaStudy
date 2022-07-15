package com.xzit.abstracts;

/**抽象类        抽象类就是用来被继承的
 *              抽象类不能用fanal修饰
 *              抽象类自身不能够实例化，必须依赖子类进行创建
 *              抽象类对象都是上转型对象
 *
 *              抽象类被非抽象类继承 必须对所有抽象方法提供实现
 *              运行时多态：多态性（Polymorphism）是指在超类中定义的属性或行为，被子类继承之后，可以具有不同的数据类型或表现出不同的行为，
 *                          这使得同一个属性或者行为在超类及其各个子类中具有不同的语义
 * */

public abstract class Animal {
    private String name="    ";
    public abstract void run();//没有实际功能
    public abstract void eat();
    public abstract void hunt();
    public void setName(String name) {
        this.name = name;
    }


    public Animal(){//构造器
        System.out.println("我是抽象类");
    }
    public Animal(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}
