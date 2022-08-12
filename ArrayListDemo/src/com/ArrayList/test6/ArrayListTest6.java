package com.ArrayList.test6;

/*
main方法中定义一个集合，存入三个用户对象
  用户属性：id，username，password
要求，定义一个方法，根据id查找对应的用户信息
存在则返回true
* */

import java.util.ArrayList;

public class ArrayListTest6 {
    public static void main(String[] args) {
        ArrayList<User> list=new ArrayList<>();

        User u1=new User("01","zhansan","123456");
        User u2=new User("02","lisi","123");
        User u3=new User("03","wanwu","456");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println(getUsers(list,"02"));

        //return getIndex(list,id)>=0;

    }
    public static boolean getUsers(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            String uid=list.get(i).getId();
            if (uid.equals(id))
                return true;
        }
        return false;
    }

}
