package com.itheima.test;

import java.util.Scanner;

//优化
public class FlyTicket2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //1、键盘录入机票原价、月份、头等舱或经济舱
        System.out.printf("输入机票原价：");
        int ticket=sc.nextInt();
        System.out.println("输入当前月份");
        int mouth=sc.nextInt();
        System.out.println("输入头等还是经济舱");
        int seat=sc.nextInt();
        //2、判断是淡季还是旺季
        // 3、继续判断当前机票是经济舱还是头等舱
        if (mouth>=5&&mouth<=10){//旺季
            ticket=youhui(ticket,seat,0.9,0.85);
        }else if ((mouth>=1&&mouth<=4)||(mouth>=11&&mouth<=12)){//淡季
            ticket=youhui(ticket,seat,0.7,0.65);
        }else System.out.println("月份不合法");

        System.out.println("票价为："+ticket);

    }

    //ctrl+alt+m   重写方法
    private static int youhui(int ticket,int seat,double v0,double v1){//v0v1分别为头等和经济折扣
        if(seat==0){
            //头等舱
            ticket=(int) (ticket*v0);
        }else if (seat==1){
            //经济舱
            ticket=(int) (ticket*v1);
        }else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }
}
