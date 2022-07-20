package com.itheima.test;

import java.util.Scanner;
/**机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱和经济舱
 * 旺季（5-10月）：头等舱9折，经济舱8.5折
 * 淡季（11-4月）：头等舱7折，经济舱6.5折
 * */

//分析：
/**1、键盘录入机票原价、月份、头等舱或经济舱
 *
 *
 *
 * 4、根据实际情况计算出对应的价格
 */

public class FlyTicket {
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
            if(seat==0){
                //头等舱
                ticket=(int) (ticket*0.9);
            }else if (seat==1){
                //经济舱
                ticket=(int) (ticket*0.85);
            }else {
                System.out.println("没有这个舱位");
            }
        }else if ((mouth>=1&&mouth<=4)||(mouth>=11&&mouth<=12)){
            if(seat==0){
                //头等舱
                ticket=(int) (ticket*0.7);
            }else if (seat==1){
                //经济舱
                ticket=(int) (ticket*0.65);
            }else {
                System.out.println("没有这个舱位");
            }
        }else System.out.println("月份不合法");
        System.out.println("票价为："+ticket);

    }
}
