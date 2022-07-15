//赋值运算符 = +=  -=  *=  /=  %=        运算顺序 从左往右

public class AssignOperator {
    static final int MAX=1000; //不能给常量赋值
    public static void main(String[] args) {
        int age;
        age=23;
        double high=age;
        System.out.println(high);

        int num=100;
        num +=age;//复合赋值   num+age再赋值给num
        System.out.println(num);
        num %=age; //取余后赋值
        System.out.println(num);
    }
}
