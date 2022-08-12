package com.xiren.staticdemo1;

public class TestDemo1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        String str=ArrayUtil.printArr(arr);
        System.out.println(str);

        double[] arr2={1.5,3.7,4.9,5.8,6.6};
        double avg=ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}
