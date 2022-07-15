package Array;
//多维数组
/*  1 2 3
    4 5 6
    7 8 9
* */
public class MulArray {

    public static void main(String[] args) {
        int [][] ints = new int[3][3]; //声明多维数组
        int num=1;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j]=num++;
            }
        }
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.printf(ints[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
