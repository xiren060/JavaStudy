package com.test3;

public class test {
    public static void main(String[] args) {
        Phone[] arr=new Phone[3];

        Phone p1=new Phone("小米",1999,"白色");
        Phone p2=new Phone("华为",4999,"蓝色");
        Phone p3=new Phone("魅族",2999,"红色");

        arr[0]=p1;
        arr[1]=p2;
        arr[2]=p3;

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone=arr[i];
            sum=sum+phone.getPrice();
        }
        double avg=sum*1.0/ arr.length;
        System.out.println(avg);
    }




}
