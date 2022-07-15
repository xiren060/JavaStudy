package com.xzit.test;

import com.xzit.entity.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student stu1=new Student();
        Student stu2=new Student();

        stu1.name="张三";
        String namenew= stu1.name;//存储
        System.out.println(namenew);

        System.out.println(stu1.feature);//不提倡使用对象方法访问static属性
        System.out.println(Student.feature);

    }
}
