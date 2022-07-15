package com.xzit.test;

import com.xzit.entity.Student;

public class TestCreateobject {
    public static void main(String[] args) {
        //通常使用new运算符调用自定义类的构造方法实现创建属于这个类的对象

        Student stu1; //声明自定义类型 Students
        stu1=new Student(); //使用构造方法创建对象

        Student stu2;
        stu2 =new Student();

        System.out.println(stu2==stu2);//判断对象是否相同（是否持有同一个对象的句柄）

        Student stu3=stu2; //对象赋值给对象
        stu3=new Student();
        System.out.println(stu2==stu3);

    }
}
