import java.util.Scanner;

public class IfElseIf {
    static Scanner cin=new Scanner(System.in);
    public static void main(String[] args) {
        double score;
        System.out.println("请输入分数：");
        score=cin.nextDouble();
        if (score>=0 && score<=100){
            if (score>=90) {//优秀
                System.out.println("优秀");
            }else if(score>=80){
                System.out.println("良好");
            }else if(score>=70){
                System.out.println("中等");
            }else if (score>=60){
                System.out.println("及格");
            }else {
                System.out.println("不及格");
            }
        }else {
            System.out.println("请重新输入");
        }

    }
}
