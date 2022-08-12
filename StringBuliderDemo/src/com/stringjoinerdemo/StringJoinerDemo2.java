package com.stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner(",","[","]");
        sj.add("a").add("b").add("c");

        int len=sj.length();


        System.out.println(len);//7
        System.out.println(sj);

        sj.toString();
    }
}
