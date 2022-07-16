//char  字符常量 'A'  '9'   '/t'        '/n'         '\\'    '\''
//                       tab健 空格     回车 换行       \       '

public class charDataType {
    public static void main(String[] args) {
        char sex='男';
        sex='女';
        sex='M';
        System.out.println('\'');//输出单引号'

        //char 可以直接赋值给int
        int age='A';
        System.out.println("年龄为：" + (char)/*强制类型转换*/age);
        /**低精度变量 = (低精度类型关键字) 高精度常量/变量
         *   int age=(int)60.5;
         *   float money = (float)5121.4561;
         *   int num = (int) money;
         */
    }



}
