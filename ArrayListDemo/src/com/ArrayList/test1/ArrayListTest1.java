package com.ArrayList.test1;


import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args) {
        //
        ArrayList<Integer> list=new ArrayList<>();//普通数据类型要用包装类
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i==list.size()-1){
                System.out.print(list.get(i));
            }else System.out.print(list.get(i)+",");
        }
        System.out.println("]");
    }

}
