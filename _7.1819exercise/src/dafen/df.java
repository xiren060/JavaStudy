package dafen;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 六位评委给选手打分，分值范围是0~100之间的整数
 * 选手最后的得分为：去掉最高分、最低分之后的平均分
 * */
public class df {
    public static void main(String[] args) {
        int scoreArr[]=getScores();
        for (int i = 0; i < 6; i++) {
            System.out.print((i+1)+"号评委\t");
        }
        System.out.println();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.print(scoreArr[i]+"\t\t");
        }
        System.out.println("\n");
        int max=getMax(scoreArr);
        int min=getMin(scoreArr);
        int sum=getSum(scoreArr);
        int avg=(sum-max-min)/(scoreArr.length-2);
        System.out.println("选手最终得分为"+avg);
    }

    //输入数值进入数组
    public static int[] getScores(){
        int[] scores=new int[6];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < scores.length;) {
            System.out.print((i+1)+"号评委打分:");
            int score=sc.nextInt();
            if (score>=0 && score<=100){
                scores[i]=score;
                i++;
            }else System.out.println("数据不合法，重新输入");

        }

        return scores;
    }
    //求最大值方法
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    //求最小值方法
    public static int getMin(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    //求和
    public static int getSum(int[] arr){
        int sum= Arrays.stream(arr).sum();
        return sum;
    }
}
