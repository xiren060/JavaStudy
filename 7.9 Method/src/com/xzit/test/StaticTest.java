package com.xzit.test;

import com.xzit.domain.AreaStatic;

public class StaticTest {
    public static void main(String[] args) {

        System.out.println(AreaStatic.Area(34.5,123.78));
        /*StaticMethod duixiang=new StaticMethod();
        duixiang.Area(123,156);*///不提倡使用实例访问静态方法
    }
}
