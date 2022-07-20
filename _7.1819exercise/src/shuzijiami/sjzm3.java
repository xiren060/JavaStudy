package shuzijiami;

import java.util.Scanner;

//总的程序
public class sjzm3 {
    public static void main(String[] args) {
        System.out.print("请输入密码：");
        Scanner cin=new Scanner(System.in);
        int number= cin.nextInt();
        int temp=number;

        //1、计算出数组的长度
        int count=0;
        while (number!=0){
            number=number/10;
            count++;
        }
        //2、定义数组
        int[] arr=new int[count];
        //3、吧整数上的每一位都添加到数组中
        while (count>0){
            int ge=temp%10;
            arr[count-1]=ge;
            count--;
            temp=temp/10;
        }
        //加密
        //每位加5
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=5;
        }
        //对10取余
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]%10;
        }
        //反转
        for (int i = 0,j= arr.length-1; i < j; i++,j--) {
            int temp1=arr[i];
            arr[i]=arr[j];
            arr[j]=temp1;
        }
        //遍历
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
        System.out.println();
        //拼接为一个整数
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            num=num*10+arr[i];
        }
        System.out.println("加密后:"+num);
    }

}
