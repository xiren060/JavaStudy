import java.util.Scanner;

/**switch(){
 * case 常量表达式1 :
 *      执行语句;break;
 * case 常量表达式2 :
 *      执行语句;break;
 * default : 执行语句
    }
 */

public class Switch {
    static Scanner cin=new Scanner(System.in);

    public static void main(String[] args) {
        int num=1;
        System.out.println("输入1/2/3");
        num= cin.nextInt();
        switch (num){
            case 1:
                System.out.println("中国");
                break;
            case 2:
                System.out.println("美国");
                break;
            case 3:
                System.out.println("日本");
            default:
                System.out.println("不属于");
        }
    }
}
