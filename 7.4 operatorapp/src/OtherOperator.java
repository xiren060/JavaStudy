//其他特殊运算符

import java.util.Scanner;

public class OtherOperator {
    public static void main(String[] args) {
        //new  用来新建对象
        Scanner sca=new Scanner(System.in);

        // .  用来访问对象的属性和方法
        System.out.println("请输入一个整数");
        int a=sca.nextInt();
        System.out.println(a);

        // ( ) 典型的方法标志，在定义方法或调用方法时必须提供
        // [ ]  标识数组

        //instanceof 判断某个对象是否属于每个类型的运算符关键字
        boolean bool=sca instanceof Scanner;
        System.out.println(bool);

        }

    }

