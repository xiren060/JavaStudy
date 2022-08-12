package com.ArrayList.test2;

import java.util.ArrayList;

//定义一个集合，添加一些学生对象，并进行遍历
//学生属性：姓名，年龄
public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();

        //创建学生对象
        Student stu1=new Student("张三",25);
        Student stu2=new Student("李四",19);
        Student stu3=new Student("王五",28);

        //添加元素
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }

    }
}
