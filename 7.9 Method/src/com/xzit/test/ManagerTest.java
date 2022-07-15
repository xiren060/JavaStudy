package com.xzit.test;

import com.xzit.domain.Manager;

public class ManagerTest {
    public static void main(String[] args) {
        Manager data=new Manager();
        int a=5;
        int b=6;

        data.setSum(a,b);//传递值类型在方法中 不会更改原数据

        System.out.println("a="+a);
        System.out.println("b="+b);

        System.out.println(data.countData(34.5,12.33,'+'));
        System.out.println(data.countData(34.5,12.33,'-'));
        System.out.println(data.countData(34.5,12.33,'*'));
    }
}
