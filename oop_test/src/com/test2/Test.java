package com.test2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Car[] arr=new Car[3];
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            //创建对象
            Car car=new Car();
            //录入
            System.out.println("请输入品牌：");
            String brand=sc.next();//输入字符串
            car.setBrand(brand);
            System.out.println("请输入价格：");
            double price= sc.nextDouble();
            car.setPrice(price);
            System.out.println("请输入颜色：");
            String color=sc.next();
            car.setColor(color);

            //
            arr[i]=car;
        }
        for (int i = 0; i < arr.length; i++) {
            Car car=arr[i];
            System.out.println(car.getBrand()+" ，"+car.getPrice()+" ，"+car.getColor());
        }

    }



}
