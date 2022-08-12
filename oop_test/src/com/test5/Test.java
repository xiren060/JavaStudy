package com.test5;

public class Test {
    public static void main(String[] args) {

        Student[] arr=new Student[3];

        Student stu0=new Student(01,"张三",24);
        Student stu1=new Student(02,"李四",27);

        arr[0]=stu0;
        arr[1]=stu1;


        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        Student stu3=new Student(04,"赵六",30);

        boolean flag=contains(arr,stu3.getId());
        if (flag){
            System.out.println("该id已存在,请修改");
        }//id不存在  还要判断数组是否存满
           else {
            int count=getCount(arr);
            if (count== arr.length){//已存满  创建新数组
                Student[] newArr=creatNewArr(arr);//创建新数组并拷贝旧数组
                newArr[count]=stu3;//吧新id加入新数组

                //要求2：添加完毕之后，遍历所有学生信息。
                printArr(newArr);
            }else {
                arr[count]=stu3;//未存满 直接加入
                 printArr(arr);
            }
        }





    }
    //遍历
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu=arr[i];
            if (stu!=null)
                System.out.println(stu.getId()+" ,"+stu.getName()+" ,"+ stu.getAge());
        }
    }

    //学号的唯一性判断。
    public static boolean contains(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu=arr[i];
            if (stu!=null){
                int sid=stu.getId();
                if (sid==id){
                    return true;
            }

            }
        }
        return false;
    }
    //判断一个数组中已经存了几个元素
    public static int getCount (Student[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null)
                count++;
        }
        return count;
    }

    //创建一个新的数组 长度加一   吧老数组拷贝进新数组
    public static Student[] creatNewArr(Student[] arr){
        Student[] newArr=new Student[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        return newArr;
    }
}
