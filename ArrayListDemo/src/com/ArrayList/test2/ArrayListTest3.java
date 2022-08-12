package com.ArrayList.test2;

import java.util.ArrayList;
import java.util.Scanner;

//从键盘录入学生信息
public class ArrayListTest3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();//长度为0

        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student stu=new Student();
            System.out.println("请输入学生姓名");
            stu.setName(sc.next());
            //String name = sc.next();
            System.out.println("请输入学生年龄");
            stu.setAge(sc.nextInt());
            //int age = sc.nextInt();

            list.add(stu);
        }

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}
