package com.xzit.test;
import  com.xzit.Staff;
import com.xzit.interfaces.Computer;

public class TestHiddenClass {
    public static void main(String[] args) {
        Staff mark=new Staff();
        double a=23.5;
        double b=45.7;
        //匿名类通常继承一个父类或实现一个接口。         // 创建的匿名类继承了 Computer类
        mark.useComputerWorking(new Computer() {
            //匿名类是表达式形式定义的，所以末尾以分号 ; 来结束
            @Override  //重写父类方法useComputer
            public void useComputer(double a,double b) {
                double res=a+b;
                System.out.println("用计算机计算，结果是："+res);
            }
        },a,b);

    }
}