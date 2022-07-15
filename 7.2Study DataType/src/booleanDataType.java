//boolean    true false

import java.util.Scanner;

public class booleanDataType {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int num=0;
        boolean bool; //储存是否已婚
        System.out.println("已婚输入数字1，否则输入数字0");
        num=input.nextInt();
        if (num==1){
            bool=true;
        }else {
            bool = false;
        }
        System.out.println("结果:"+bool);
    }
}
