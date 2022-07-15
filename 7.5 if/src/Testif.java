import java.util.Scanner;

    public class Testif{

        static  final int  CH_AGE=18;
        static Scanner cin=new Scanner(System.in);

        public static void main(String[] args) {

            int age;
            System.out.println("请输入年龄：");
            age=cin.nextInt();
            if (age<CH_AGE) {
                System.out.println("未成年");
            }else {
                System.out.println("已成年");
            }


        }
    }
    
