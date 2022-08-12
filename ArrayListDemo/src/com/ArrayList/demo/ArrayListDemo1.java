package com.ArrayList.demo;

import java.util.ArrayList;
/*

        boolean add ( E e )         添加元素，返回值表示是否添加成功
        boolean remove ( E e )      删除指定元素，返回值表示是否删除成功
        E remove ( int index )       删除指定索引的元素，返回被删除元素
        E set ( int index , E e )       修改指定索引下的元素，返回原来的元素
        E get ( int index )           获取指定索引的元素
        int size ()                 集合的长度，也就是集合中元素的个数
*/

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1.创建集合对象
        ArrayList<String> list=new ArrayList<>();

        //2.添加元素
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);

        //3.删除元素
        boolean bool=list.remove("aaa");
        System.out.println(list);
        System.out.println(bool);


        //4.
        String str=list.remove(2);
        System.out.println(list);
        System.out.println(str);


        //5.修改元素
        String result= list.set(1,"abc");
        System.out.println(list);
        System.out.println(result);

        //6.查询
        String cx=list.get(0);
        System.out.println(list);
        System.out.println(cx);

        //7.遍历
        for (int i = 0; i < list.size(); i++) {
            String bl=list.get(i);
            System.out.print(bl);
        }

    }
}
