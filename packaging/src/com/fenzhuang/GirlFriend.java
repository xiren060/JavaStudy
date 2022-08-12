package com.fenzhuang;

public class GirlFriend {
    private int age;
    private String name;

    //构造器    创建对象时，虚拟机自动调用构造方法
    //空构造方法   必写
    public GirlFriend(){

    }
    //带参构造方法  如果创建了带参构造，系统就不提供空构造器
    public GirlFriend(String name,int age){
        this.age=age;  //this的本质：代表方法调用者的地址值
        this.name=name;
    }

    //局部变量与成员变量同名时,调用时就近原则
    public void setAge(int age) {
        if (age>=18 && age<=50){
            // 用this关键字调用成员变量
            this.age = age;
        }else System.out.println("输入的age为非法");
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
