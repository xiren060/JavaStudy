package com.xzit.domain;

public class Student {
    private String code;
    private String name;
    private int age;
    private String sex;

    //误餐构造器
    public Student(){

    }
    //构造器
    public Student(String code, String name, int age, String sex) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    //方法,自我介绍的实例方法
    public void introduct(){
        System.out.println("我叫"+name);
        System.out.println("我的学号是："+code);
        System.out.println("我今年"+age+"岁");
        System.out.println("我是"+sex+"生");
    }
    //方法，朗读的内容
    public void read(String content){
        System.out.println("我是"+name+"\t朗读的内容是:"+content);
    }
}



