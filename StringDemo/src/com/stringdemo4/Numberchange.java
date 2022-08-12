package com.stringdemo4;

public class Numberchange {
    public static void main(String[] args) {
        //1.获取一个手机号
        String num="18387797018";

        //2.截取手机号码前三位  substring
        String start=num.substring(0,3);

        //3.截取手机号码后四位
        String last=num.substring(7);

        System.out.println(start+"****"+last);
    }
}
