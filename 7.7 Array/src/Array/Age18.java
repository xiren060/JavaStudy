package Array;
/**对存储年龄数组中的年龄进行操作
 * 如果年龄不满18岁，则对其进行判断，少多少増加多少使之正好等于18岁并统计
 * 数组中曾经有几个不满18岁的年龄，被修改的年龄一共增加了多少岁
 * */

public class Age18 {
    public static void main(String[] args) {
        int []ages={17,34,14,50,26,15,36};
        int ItAgeCount=0;//存储小于18岁的年龄个数
        int addAgeSum=0;//村塾实际小于18岁所有年龄增加的总和

        for (int i = 0; i < ages.length; i++) {
            if (ages[i]<18){
                ItAgeCount++;
                int sub=18-ages[i];//存储增加的数值

                ages[i]+=(18-ages[i]);
                addAgeSum+=sub;
            }
        }
        System.out.printf("于18岁的年龄个数:"+ItAgeCount+"\n");
        System.out.printf("实际小于18岁所有年龄增加的总和:"+addAgeSum+"\n");
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i]+"\t");
        }
    }

}
