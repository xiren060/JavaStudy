package com.xzit.domain;

//静态方法    不能使用this关键字
//对面积的计算管理
public class AreaStatic {

    private int sum;
    public static double Area(double h,double d){
        //System.out.println(this.sum);   不能使用this关键字
        //show();     静态方法中不能访问实例方法
        return h*d;
    }

    private void show(){
    }

    //重载  计算梯形面积
    public static double Area(double h,double u,double d){
        return (u+d)*h/2;
    }
    //重载  圆的面积
    public static double Area(double r){
        return Math.PI*r*r;
    }
}
