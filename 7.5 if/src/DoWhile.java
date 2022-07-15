//do(){
//
// }while(布尔表达式);值为true则循环   false则跳出循环

import java.util.Random;
import java.util.Scanner;

public class DoWhile {
    static Scanner cin=new Scanner(System.in);

    public static void main(String[] args) {
        Random random=new Random();
        int num=0;
        String succ="😊";
        String fail="😭";
        boolean bool=true;

        do {
            int suiji=random.nextInt(10);//生成小于5的随机整数
            System.out.println("输入0~10之间的一个整数");
            num= cin.nextInt();
            if (num==suiji){
                System.out.println("猜对了"+succ);
                bool=false;
            }else {
                System.out.println("猜错了,随机数是"+suiji+"请重新猜"+fail);//从新循环
            }
        }while (bool);
    }
}
