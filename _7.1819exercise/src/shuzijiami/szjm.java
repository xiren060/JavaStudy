package shuzijiami;

/**
 * 每位加5
 * 对10取余
 * 所有数字反转
 * */
public class szjm {
    public static void main(String[] args) {

        //吧整数里的每一位放到数组中
        int[] arr2={1,9,8,3};
        //加密
         //每位加5
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]+=5;
        }
         //对10取余
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=arr2[i]%10;
        }
         //反转
        for (int i = 0,j= arr2.length-1; i < j; i++,j--) {
            int temp=arr2[i];
            arr2[i]=arr2[j];
            arr2[j]=temp;
        }
       //遍历
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println("\n");
        //拼接为一个整数
        int num=0;
        for (int i = 0; i < arr2.length; i++) {
            num=num*10+arr2[i];
        }
        System.out.println(num);
    }

}
