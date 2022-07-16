//浮点数据类型   float单精度  -->  double双精度  (√)

import java.text.DecimalFormat;
import java.util.Scanner;

public class FloatDataType {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        float height= 178.5f;
        double money=355132.16517168416854157163;
        DecimalFormat df=new DecimalFormat("0.000000");//保留6位小数
        String moneychange =df.format(money);//得到字符串
        System.out.println("处理double后的数据:"+moneychange);

        /*System.out.print("输入身高：");
        height=input.nextFloat();
        System.out.println("身高为："+height);
        System.out.print("存款为："+money);*/

        //科学计数法表示浮点数
        double money2=2E2;//2*10^2
        System.out.println(money2);

        money2=1545615451548678976.135456;
        System.out.println("科学计数法"+money2);

    }

}
