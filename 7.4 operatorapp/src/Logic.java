/**逻辑运算符  && 逻辑与  并且   1 && 1=1  1 && 0=0   0 && 0=0
 *            || 逻辑或  或者
 *            !  逻辑非  boolean结果取反   !true=false  !false=true
 *
 * */

public class Logic {

    public static void main(String[] args) {
        System.out.println(!true);
        System.out.println(!!true);
        System.out.println(!!!true);

        int apple=50,peach=49,banana=48;

        boolean bool3=peach>apple && peach==++banana; //短路与  一旦左侧为false 右侧就不计算了  最终结果都为false
        System.out.println(bool3);
        System.out.println(banana);
    }
}
