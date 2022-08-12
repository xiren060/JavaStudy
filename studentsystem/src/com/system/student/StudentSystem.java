package com.system.student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Student> studentArrayList=new ArrayList<>();

        loop:while (true) {
            System.out.println("----------学生管理系统------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.print("请输入你的选择：");

            String chooes=sc.next();

            switch (chooes){
                case "1": {
                    System.out.println("添加学生");
                    addStudents(studentArrayList);
                    break;
                }
                case "2": {
                    System.out.println("删除学生");
                    moveStudents(studentArrayList);
                    break;
                }
                case "3": {
                    System.out.println("修改学生");
                    updateStudents(studentArrayList);
                    break;
                }
                case "4": {
                    System.out.println("查询学生");
                    getStudents(studentArrayList);
                    break;}
                case "5": {
                    System.out.println("退出");
                    //break loop;
                    System.exit(0);//停止虚拟机运行
                }
                default:
                    System.out.println("没有这个选项，请认真输入！！！！");
            }
        }
    }

    //添加学生
    public static void addStudents(ArrayList<Student> list){
        Scanner sc=new Scanner(System.in);
        Student stu=new Student();
        System.out.println("依次输入学生id、姓名、年龄、家庭住址");


        while (true) {
            System.out.print("id:");
            String id = sc.next();
            if (!haveId(list,id)){
                stu.setId(id);
                break;
            }else {
                System.out.println("学生id已存在,请重新输入");
            }
        }


        System.out.print("姓名:");
        String name=sc.next();
        stu.setName(name);

        System.out.print("年龄:");
        int age=sc.nextInt();
        stu.setAge(age);

        System.out.print("家底住址:");
        String address=sc.next();
        System.out.println();
        stu.setAddress(address);

        list.add(stu);//一个索引对应一个对象

        System.out.println("添加成功！");

    }

    //删除
    private static void moveStudents(ArrayList<Student> list){
        if (list.size()==0){
            System.out.println("当前无学生信息，请添加");
        }else {
            System.out.print("请输入要删除的学生id：");
            Scanner sc=new Scanner(System.in);
            String id=sc.next();
            if (getIndex(list,id)>=0){
                list.remove(getIndex(list,id));
                System.out.println("删除成功！");
            }else System.out.println("id不存在，删除失败");
        }

    }

    //修改
    private static void updateStudents(ArrayList<Student> list){
        if (list.size()==0){
            System.out.println("当前无学生信息，请添加");
        }else {
            System.out.print("请输入要修改学生的id：");
            Scanner sc=new Scanner(System.in);
            String id=sc.next();

            int index=getIndex(list,id);
            if (index>=0){
                Student stu=list.get(index);

                loop:while (true) {
                    System.out.print("要修改什么属性？（1.id；2.姓名；3.年龄；4.家庭住址;5.退出）");
                    String c=sc.next();
                    switch (c){
                        case "1":{
                            System.out.print("新id：");
                            String newId=sc.next();
                            stu.setId(newId);
                            break;
                        }
                        case "2":{
                            System.out.print("新姓名：");
                            String newName=sc.next();
                            stu.setName(newName);
                            break;
                        }
                        case "3":{
                            System.out.print("新年龄：");
                            int newAge=sc.nextInt();
                            stu.setAge(newAge);
                            break;
                        }
                        case "4":{
                            System.out.print("新家庭住址：");
                            String newAddress=sc.next();
                            stu.setAddress(newAddress);
                            break;
                        }
                        case "5":{
                            System.out.println("退出");
                            break loop;
                        }
                        default:
                            System.out.println("没有这个选项，请认真输入！！！！");
                    }
                }
            }else System.out.println(id+"不存在");
        }

    }

    //查询
    private static void getStudents(ArrayList<Student> list){
        if (list.size()==0){
            System.out.println("当前无学生信息，请添加");
            return;
        }else {
            System.out.println("id    姓名    年龄     家底住址");
            for (int i = 0; i < list.size(); i++) {
                Student stu=list.get(i);
                System.out.println(stu.getId()+"     "+stu.getName()+"     "+stu.getAge()+"     "+stu.getAddress());
            }
        }
    }

    //判断id是否存在
    private static boolean haveId(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    //获取集合元素的索引
    public static int getIndex(ArrayList<Student> list,String yuansu){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(yuansu)){
                return i;//yuansu的索引
            }
        }
        return -1;
    }
}
