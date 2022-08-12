package com.test;

/*键盘录入一个字符串
1.长度小于等于9
2.只能是数字
   将内容变成罗马数字
如果数字中包含0 ，将其变成" "（长度为0的字符串）*/

import java.util.Scanner;

public class LuoMaNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();


        while (true){
            System.out.println("请输入一个字符串（数字）:");
            String str=sc.next();
            if (checkStr(str)){
                for (int i = 0; i < str.length(); i++) {
                    char a=str.charAt(i);
                    int num=a-48;
                    String res=changeLuoMa(num);
                    sb.append(res);
                }
                System.out.println(sb);
                break;
            }else {continue;}
        }

    }

    public static String changeLuoMa(int number){
        //定义一个数组，让索引与罗马数字一一对应   2.也可用switch case语句匹配罗马数字
        String[] arr={"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ"," Ⅸ"};
        return arr[number];
    }
    //判断是否输入合法
    public static boolean checkStr(String str){
        if (str.length()>9){
            System.out.println("字符串长度小于等于9");
            return false;
        }else {
            for (int i = 0; i < str.length(); i++) {
                char a=str.charAt(i);
                if (a<'0'||a>'9'){
                    System.out.println("只能是数字");
                    return false;
                }
            }
            return true;
        }
    }
}
