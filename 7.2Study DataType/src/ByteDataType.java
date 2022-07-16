//基本数据类型 short   输入输出

import java.util.Scanner;

public class ByteDataType {
    static Scanner input /*变量名*/ = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("请输入年龄：");
        Byte age =input.nextByte();//使用Scanner对象的方法  接收数字
        System.out.print("年龄为：" + age);
    }
}
