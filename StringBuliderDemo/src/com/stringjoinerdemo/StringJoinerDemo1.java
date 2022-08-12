package com.stringjoinerdemo;

import java.util.StringJoiner;

/*
public  StringJoiner(间隔符号);
public  StringJoiner(间隔符号,开始符号,结束符号);
       创建对象：
        StringJoiner  sj=new  StringJoiner(“---”);
        StringJoiner  sj=new  StringJoiner(“,”  ,  ”[”  ,  ”]”);
*/


public class StringJoinerDemo1 {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner("---");

        sj.add("aaa").add("bbb").add("ccc");

        System.out.println(sj);
    }
}
