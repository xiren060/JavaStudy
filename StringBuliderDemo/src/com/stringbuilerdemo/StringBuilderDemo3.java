package com.stringbuilerdemo;

import java.util.Scanner;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        //链式编程
        //当我们在调用一个方法的时候，不需要用变量接收他的结果，可以继续调用其他方法

        String str=getString().substring(1).replace("a","A");
        System.out.println(str);
    }
    public static String getString(){
        System.out.println("请输入一个字符串");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        return str;
    }
}
