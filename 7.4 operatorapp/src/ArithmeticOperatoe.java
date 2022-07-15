//算数运算符  双目/单目：++(自增1) --（自减1）

public class ArithmeticOperatoe {
    public static void main(String[] args) {
        int n=5;
        int m1=6;
        int m2=m1;
        n++; //对n进行变量加1  赋值给n  n=n+1;
        System.out.println("n自增1的结果是"+n);

        int g1= m1++; //后自增 先将m的原值赋给g 后m自增1
        System.out.println("后自增：g1="+g1+"\tm="+m1);
        int g2=  ++m2;//前自增  m先自增1  再赋值给g
        System.out.println("前自增：g2="+g2+"\tm="+m2);

    }
}
