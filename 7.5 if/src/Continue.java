//continue  在满足条件后结束本次循环并重新开始下一次循环

public class Continue {
    public static void main(String[] args) {
        //分别计算100以内的偶数和奇数累加
        int oodSum=0;
        int jiSum=0;
      /*  for (int i = 0; i < 100; i++) {
            if ((i&2)==0){
                oodSum+=i;
            }else {
                jiSum+=i;
            }
        }

    }*/
        for (int i = 0; i <=100; i++) {
            if (i%2==0){
              oodSum+=i;
              continue;
            }
            jiSum+=i;
        }

        System.out.println("偶数累加和："+oodSum);
        System.out.println("奇数累加和："+jiSum);
    }

}
