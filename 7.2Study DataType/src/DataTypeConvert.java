//数据类型转换   1、低精度———>高精度   2、强制转换： 高精度——>低精度

public class DataTypeConvert {
    public static void main(String[] args) {
        int num=5000;//转换的目标num
        double dou;
        dou = num;
        //num = 0.0;   //必须进行强制类型转换
        System.out.println("num转换前结果为："+dou);
        num = (int)0.0;
        System.out.println("num转换后结果为："+num);

        //short sh=dou;

        short sh=(short) dou;
        System.out.println("dou转换后结果为："+sh);

        byte by=(byte) 130; //int 转换为 byte 时  从右侧截取有效的数位作为二进制表示  00 1000 0010——>1000 0010
        System.out.println("by转换后结果为："+by);
    }
}
