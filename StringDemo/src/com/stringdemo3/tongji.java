package com.stringdemo3;

import java.util.Scanner;

public class tongji {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("请输入一个字符串:");
        String str=sc.nextLine();

        //统计
        int big=0;
        int small=0;
        int num=0;
        int other=0;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if (c>='a' && c<='z'){//char类型的变量在参与计算时  自动类型转换为int 查询ASCII码表
                small++;
            }else if (c>='A' && c<='Z'){
                big++;
            } else if (c >= '0' && c <= '9') {
                num++;
            }else other++;
        }
        System.out.println("小写字母有"+small+"个");
        System.out.println("大写字母有"+big+"个");
        System.out.println("数字有"+num+"个");
        System.out.println("其他字符有"+other+"个");
    }
}
