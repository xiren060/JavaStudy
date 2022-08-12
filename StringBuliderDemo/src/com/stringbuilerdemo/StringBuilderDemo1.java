package com.stringbuilerdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb=new StringBuilder("abc");

        //添加元素
       /* sb.append(1);
        sb.append(1.3);
        sb.append(true);
        sb.append("是的");*/

        //反转
        sb.reverse();

        //获取长度
        System.out.println(sb.length());


        System.out.println(sb);

    }
}
