package Array;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int [] scores; //声明数组
        boolean bool=true;
        System.out.print("要统计多少个人？");
        int size=cin.nextInt();
        int notpassNum=0;//存储不及格人数
        scores=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("请输入第"+(i+1)+"个成绩:");
            scores[i]= cin.nextInt();
            if (scores[i]<60){
                notpassNum++;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(scores[i]+"\t");
        }

        System.out.println("不及格人数为"+notpassNum);
    }
}
