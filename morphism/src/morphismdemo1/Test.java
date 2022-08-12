package morphismdemo1;


//多态
public class Test {
    public static void main(String[] args) {

        Student stu=new Student();
        stu.setName("张三");
        stu.setAge(18);

        Teacher teacher=new Teacher();
        teacher.setName("shibinmen");
        teacher.setAge(50);

        Administrator administrator=new Administrator();
        administrator.setName("daqiao");
        administrator.setAge(20);

        register(stu);
        register(teacher);
        register(administrator);


    }

    //这个方法既能接收老师，又能接收学生、管理员
    //只能吧参数写成这三个类型的父类
    public static void register(Person p){
        p.show();
    }
}
