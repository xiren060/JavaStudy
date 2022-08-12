package com.stringbuilerdemo;

import java.util.Scanner;

//键盘接受一个字符串，判断出该字符串是否是对称字符串

/*使用StringBuilder的场景
1.字符串的拼接
2.字符串的反转*/
public class StringBuilderDemo4 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        StringBuilder sb=new StringBuilder();

        //反转
        String turn=sb.append(str).reverse().toString();

        if (str.equals(turn)){
            System.out.println("是对称字符串");
        }else System.out.println("不是对称字符串");


    }

}
