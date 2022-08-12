package com.stringbuilerdemo;

//数组变为字符串
public class StringBuilderDemo5 {
    public static void main(String[] args) {
        int[] arr={1,2,3};

        System.out.println(arrToString(arr));

    }
    public static String arrToString(int[] arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (i== arr.length-1){//数组最后一个元素
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]+",");
            }

        }
          sb.append("]");
        return sb.toString();
    }

}
