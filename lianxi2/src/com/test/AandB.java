package com.test;

public class AandB {
    public static void main(String[] args) {
        String strA="abcde";
        String strB="cdeab";

        boolean res=check(strA,strB);
        System.out.println(res);
    }

    public static boolean check(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA=rotate(strA);
            if (strA.equals(strB)){
                return true;
            }
        }
        return false;
    }

    public static String rotate(String str){
        char first=str.charAt(0);
        String last=str.substring(1);
        return  last+first;
    }

}
