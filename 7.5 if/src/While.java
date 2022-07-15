//循环

public class While {
    public static void main(String[] args) {
        //1~100累加
      /*  int num=1;//循环变量
        int sum=0; //存储累加和
        while (num<=100){
            sum+=num;
            num++;
        }
        System.out.println(sum);*/

        //单层循环完成10x10的正方形输出
       /* int n=1;
        while (n<=10){
            System.out.println("⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ");
            n++;
        }*/
        //嵌套循环

        int line=1;
        while (line<=10){//外层循环控制换行
            int m=1;
            while (m<=10){
                System.out.print("⭐ ");
                m++;
            }
            System.out.print("\n");
            line++;
        }
    }
}
