package com.test;

import java.util.Random;
import java.util.Scanner;
/*
修改字符串的内容
1.substring
2.转变为字符数组 toCharArray()
*/
public class suijString {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str=sc.next();

            char[] arr=str.toCharArray();
            //打乱数组里的内容  从0索引开始，跟一个随机索引进行位置交换

            Random ra=new Random();


            for (int i = 0; i < arr.length; i++) {
                int num=ra.nextInt(arr.length);
                arr[i]=arr[num];
            }

            //把字符数组再变为字符串
            String result=new String(arr);
            System.out.println(result);

        }


}
