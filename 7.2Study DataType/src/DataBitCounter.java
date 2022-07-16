public class DataBitCounter {
    public static void main(String[] args) {

        //二进制 八进制 十六进制转换
        int num=130;
        String two=Integer.toBinaryString(num);
        System.out.println("130转换为二进制："+two);
        String octal=Integer.toOctalString(num);
        System.out.println("130转换为八进制："+octal);
        String hex=Integer.toHexString(num);
        System.out.println("130转换为十六进制："+hex);

    }
}
