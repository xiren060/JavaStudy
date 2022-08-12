package com.ArrayList.test6;

/*
main方法中定义一个集合，存入三个用户对象
  用户属性：id，username，password
要求，定义一个方法，根据id查找对应的用户信息
存在则返回索引
不存在则返回-1
* */

import java.util.ArrayList;

public class ArrayListTest6_2 {
    public static void main(String[] args) {
        ArrayList<User> list2=new ArrayList<>();

        User u1=new User("01","zhansan","123456");
        User u2=new User("02","lisi","123");
        User u3=new User("03","wanwu","456");

        list2.add(u1);
        list2.add(u2);
        list2.add(u3);

        System.out.println(getIndex(list2,"05"));

    }
    public static int getIndex(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

}
