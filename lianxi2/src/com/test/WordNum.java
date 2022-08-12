package com.test;

import java.util.Scanner;

//输入一个字符串 返回字符串的最后一个单词的长度
public class WordNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int count=0;
        for (int length =str.length()-1; length > 0; length--) {
            char ch=str.charAt(length);
            if (ch==' '){
                break;
            }else count++;
        }
        System.out.println(count);
    }
}
