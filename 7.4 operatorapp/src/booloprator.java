public class booloprator {
    public static void main(String[] args) {
        int mage=34;
        int fage=40;
        boolean bool0=mage>fage;
        System.out.println("妈妈的年龄大于爸爸吗？\t"+bool0);
        boolean bool1=mage<=fage;
        System.out.println("妈妈的年龄小于等于爸爸吗？\t"+bool0);
        System.out.println("妈妈年龄加上6岁是否和爸爸年龄相同"+((mage+6)==fage));
    }
}
