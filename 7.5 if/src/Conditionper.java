//java 条件表达式（三目运算符）
/**表达式1 ?  表达式2 : 表达式3
 *表达式为true  执行表达式2
 *     为false  执行表达式3
 * */

import java.util.Scanner;

public class Conditionper {
    static Scanner cin=new Scanner(System.in);
    public static void main(String[] args) {
        String message=" ";
        int age;
        System.out.println("输入年龄");
        age=cin.nextInt();
        System.out.println(age>=18 ? "你是成年人":"你是未成年");
        //message=age>=18 ? "你是成年人":"你是未成年";
        //System.out.println(message);

    }

}
