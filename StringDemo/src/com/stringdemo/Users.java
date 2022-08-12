package com.stringdemo;

import java.util.Scanner;

/**
 * 已知用户名和密码，请用程序实现模拟用户登录
 * 有三次机会，登录之后，给出相应提示
 * */
public class Users {
    public static void main(String[] args) {
        //创建两个字符串，记录正确的用户名和密码
        String rightUsername="zhangsan";
        String rightUserpassword="123456";

        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.printf("请输入用户名：");
            String username=sc.next();
            System.out.printf("请输入密码：");
            String userpassword=sc.next();
            if ((username.equals(rightUsername)) && (userpassword.equals(rightUserpassword))){
                System.out.println("登录成功");
            }else {
                if(i==2){
                    System.out.println("账号已锁定");
                }else System.out.println("登陆失败,还剩"+(2-i)+"次机会");
            }
        }

    }
}
