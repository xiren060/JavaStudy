package com.xzit.domain;

public class Employee {

    private String name;
    private int workAge;
    private int sex;

    //构造器，构造方法的第一作用是用来创建对象
    public Employee(){

    }
    //使用带参数的构造器实现在创建对象时对其进行初始化（为成员属性赋值）
    /** public Employee(String n,int s,int w){
        name=n;
        sex=s;
        workAge=w;}
     */

    public Employee(String name,int sex,int workAge){
        this.name=name;
        this.sex=sex;
        this.workAge=workAge;

        System.out.println(name+"\t"+sex+"\t"+workAge);
    }

    public Employee(String name, int sex) {
        this.name = name;
        this.sex = sex;
    }
}
