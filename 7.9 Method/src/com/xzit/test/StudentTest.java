package com.xzit.test;

import com.xzit.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student stu1=new Student("01","张三",18,"男");
        Student stu2=new Student("02","李四",20,"女");

        stu1.introduct();//张三介绍自己
        System.out.println();
        stu2.introduct();

        stu1.read("日照香炉生紫烟\n遥看瀑布挂前川\n飞流直下三千尺\n疑是银河落九天\n");
        stu2.read("折戟沉沙铁未销\n");
    }
}
