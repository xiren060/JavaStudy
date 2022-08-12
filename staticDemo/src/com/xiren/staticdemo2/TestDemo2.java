package com.xiren.staticdemo2;

import java.util.ArrayList;

public class TestDemo2 {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList=new ArrayList<>();

        Student stu1=new Student("zhansan",23,"男");
        Student stu2=new Student("lisi",25,"女");
        Student stu3=new Student("wanwu",15,"男");

        studentArrayList.add(stu1);
        studentArrayList.add(stu2);
        studentArrayList.add(stu3);

        int maxAge=StudentUtil.getMaxAgeStudents(studentArrayList);
        System.out.println(maxAge);
    }
}
