//按位运算 & | ! ^
// ^ 按位异或  对bool：相同为false  不同为true   对整数：相同为0  不同为1

public class BitOperator {
    public static void main(String[] args) {
        //按位与  &   不短路底层 按位进行运算
        int n=5,m=6,k=7;
        boolean bool= m<n  &  m== --k; //左侧为假 但右侧仍然计算
        System.out.println(bool);
        System.out.println(k);

        //按位对整数进行计算
        System.out.println("5和4按位计算结果："+(5 & 4));
        /** 4 0 0100
         *  5 0 0101
         * -----------
         *    0 0100
         */
        System.out.println("-5和5按位计算结果:"+(-5 & 5));
        /** 5 0 0101
         * -5 1 1011
         * ----------
         *    0 0001
         * */
    }
}
