import java.util.Scanner;

/**
 * 使用佛如循环控制用户银行卡密码输入次数
 * 第二次输入错误后提醒用户在输入错位将锁定银行卡
 * 如果第三次输入错误则锁定
 * */


public class BandFor {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int key = 123456;
        boolean lock=false;//银行卡状态  true为锁定
        int user_key;//用户输入的密码
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入密码");
            user_key= cin.nextInt();
            if (user_key==key){
                System.out.println("密码正确，请继续");
                i=4;
            }else {
                if (i==1){
                    System.out.println("密码输入第"+i+"次");
                }else if (i==2){
                    System.out.println("密码输入第"+i+"次,第三次错误则锁定");
                }else {
                    lock=true;
                    System.out.println("密码输入第"+i+"次，银行卡已锁定");
                }
             }
        }

    }
}
