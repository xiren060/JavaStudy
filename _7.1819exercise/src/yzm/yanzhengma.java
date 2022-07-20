package yzm;

/**定义方法实现随机产生一个5位的验证码
 * 格式：长度为5   前四位是大写或小写字母  最后一位是数字
 */

import java.util.Random;

/** 方法
 * 在一堆没有规律的数组中随机抽取
 * 可以先把这些数据放在数组当中
 * 在随机抽取一个索引
 */

/*分析
        * A~Z  a~z
        * 1、大写小写字母放到数组当中  ASCII码
        *                 小写（char）（97+i）   大写（char）（65+i-26）
        * 2、随机抽取4次  定义一个字符串类型的变量。记录最终结果
        * 3、随机抽取一个数字~9
        **/

public class yanzhengma {
    public static void main(String[] args) {
        char[] getabc=new char[52];
        //随机生成字母放在数组中
        for (int i = 0; i < getabc.length; i++) {
            if (i<=25){
                getabc[i]=(char)(97+i);//小写字母
            }else getabc[i]=(char)(65+i-26);
        }
        String res="";//定义一个字符串类型的变量。记录最终结果
        //随机抽取索引
        Random r=new Random();
        for (int i = 0; i <4; i++) {
            int randomIndex=r.nextInt(52);
            //System.out.println(getabc[randomIndex]);
            res=res+getabc[randomIndex];
        }
        //生成随机数
        int number=r.nextInt(10);
        //组合最终结果
        res+=number;
        System.out.println(res);






    }

}
