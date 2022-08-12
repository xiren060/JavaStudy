package com.sringdemo2;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        //遍历
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            System.out.println(c);
        }
    }
}
