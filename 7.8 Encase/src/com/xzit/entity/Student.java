package com.xzit.entity;
/**
 * 学生类  表示学生实体数据
 * */
public class Student {

    public static String feature="学习";    //共同特征     static 修饰的属性是类属性，属于类的特征，它的值被所有此类的对象共享
    public static final int MAX_AGE=100;    //静态数据随类的加载被加载，优先与实例数据
    public String name;
    int age;
    private   Student address;
    public  char sex;
    private  double height;      //实例属性

}
