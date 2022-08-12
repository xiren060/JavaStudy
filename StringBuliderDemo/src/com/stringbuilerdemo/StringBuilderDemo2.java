package com.stringbuilerdemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");

        //吧StringBuilder变回字符串String类型   StringBuilder只是一个容器
        String str= sb.toString();
    }
}
