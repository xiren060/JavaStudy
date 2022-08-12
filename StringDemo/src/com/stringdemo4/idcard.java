package com.stringdemo4;
//7-14位：出生年 月 日
//17位：性别，奇数男 偶数女

//提取人物信息  出生年月  性别
public class idcard {
    public static void main(String[] args) {
        String id="530402200011040310";
        //获取出生年月
        String year=id.substring(6,10);
        String month=id.substring(10,12);
        String day=id.substring(12,14);
        System.out.println("人物信息为：");
        System.out.println("出生年月日："+year+"年"+month+"月"+day+"日");

        //获取性别   charAt  获取单个索引
        char gender=id.charAt(16);
        //判断性别  利用ASCII码表进行转换
        //0-->48
        //3-->51
        int num=gender-48;//=3
        if (num % 2==0){
            System.out.println("性别为：女");
        }else System.out.println("性别为：男");

    }

}
