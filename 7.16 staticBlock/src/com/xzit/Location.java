package com.xzit;
/*
静态代码块

        静态代码块中允许访问静态属性
        允许调用静态方法
        允许定义局部变量及常量
        允许定义局部类
        不能访问实例属性和方法  以及定义方法
*/

public class Location {
    public static final int EAST;
    public static final int WEST;
    public static final int SOUTH;
    public static final int NORTH;

    public double distance;
    //构造器
    public Location(double distance){
        this.distance=distance;
        System.out.println("调用构造器，创建对象");
    }

    //静态块
    static{
        EAST=0;
        WEST=1;
        SOUTH=2;
        NORTH=3;
        displayLocation();//可以直接调用
        //displayDistance(distance);//静态块中不允许访问非静态字段、非静态方法

        class B{}//允许定义内部类 局部类，，只能在此静态块中访问
    }

    //方法  显示位置
    public static void displayLocation(){
        //默认位置
        System.out.println("默认位置是"+NORTH);
    }

    private void displayDistance(double distance){

    }


}
