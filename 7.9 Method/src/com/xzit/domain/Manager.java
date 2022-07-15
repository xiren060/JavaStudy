package com.xzit.domain;

public class Manager {
    //方法  计算n m的和
    public void setSum(double n,double m){
        n++;m++;
        System.out.println(n+m);
    }

    //对给定的两个数  根据ch标志进行计算并返回结果  （+号计算和  -号计算差  否则计算乘积）
    public double countData(double a,double b,char ch){
        if (ch=='+')
            return a+b;
        else if (ch=='-')
            return a-b;
        return a*b;
    }
}
