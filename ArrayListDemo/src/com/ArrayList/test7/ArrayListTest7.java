package com.ArrayList.test7;

import java.util.ArrayList;
/*
Phone属性：品牌，价格
存入三个手机对象
定义一个方法，将价格低于3000的手机信息返回
*/

public class ArrayListTest7 {
    public static void main(String[] args) {
        ArrayList<Phone> list=new ArrayList<>();

        Phone p1=new Phone("小米",1000);
        Phone p2=new Phone("锤子",8000);
        Phone p3=new Phone("华为",3000);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        //创建一个集合phones 存储价格小于3000的手机信息
        ArrayList<Phone> phones=getMassage(list);

        for (int i = 0; i < phones.size(); i++) {
            //Phone ph=phones.get(i);//获取集合phones中指定索引的元素
            System.out.println(phones.get(i).getBrand()+","+phones.get(i).getPrice());
        }
    }

    //如果要返回多个数据，可以先吧这些数据先放到一个容器中，再把容器返回
    public static ArrayList<Phone> getMassage(ArrayList<Phone> list){
        ArrayList<Phone> resultlist=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice()<=3000){
                resultlist.add(list.get(i));

            }
        }
        return resultlist;
    }
}
