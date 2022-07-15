package com.xzit.domain;

public class Dog {
    private String color;
    public Dog(){}

    public Dog(String c){color=c;}

    //传递引用类型     改变狗的颜色
    public void changeColor(Dog dog){
        dog.setColor("五彩斑斓");
    }
    //使用公共的set方法 实现对私有属性赋值
    public void setColor(String c){
        this.color=c;
    }
    //使用公共的get方法 获取私有属性的值
    public String getColor(){
        return this.color;
    }

    public boolean validateAge(int age){
        if (age>=0 && age<=120)
            return true;
        return false;
    }

}
