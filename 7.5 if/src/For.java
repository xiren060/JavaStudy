/** for(表达式1;布尔表达式;表达式3){
 *      循环体代码;
   }
 *  为true 则进入循环
 * */

public class For {
    public static void main(String[] args) {
        for (int i = 0; i <9; i++) {  //外层循环负责换行
            for (int j = 0; j < 9; j++) {
                //通过偶数行和奇数行判断打印
                if (i%2==1) {//奇数行
                    System.out.print("⭐");
                }else System.out.print("🔴");
                }
            System.out.println();
            }

        }
    }
