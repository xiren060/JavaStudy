package Array;

public class ArrayDemoOne {
    public static void main(String[] args) {
        char[] chars;//声明数组
        int len =6;
        chars=new char[len];//创建数组
        System.out.println(chars.length);//访问数组长度 首元素地址从0开始

        chars[1]='A';
        //使用循环遍历数组元素
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);     //char数组  默认为空格
        }

        int ints[]=new int[4];
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);       //int数组  默认为0
        }

        String strs[]=new String[3];
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);      //String数组  默认为null
        }
    }
}
