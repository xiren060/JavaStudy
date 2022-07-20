package shuzijiami;

import java.util.Scanner;

//吧整数的每一位都添加到数组当中
public class szjm2 {
    public static void main(String[] args) {
        //动态初始化数组
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
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
