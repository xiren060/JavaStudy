package com.stringdemo3;

import java.util.Scanner;

//字符串反转
public class fanzhuanString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(reverser(sc.next()));
    }

    public static String reverser(String str){
        String result="";
        for (int i = str.length()-1; i >= 0; i--) {//倒着遍历
            char c=str.charAt(i);
            result=result+c;
        }
        return result;
    }
}
