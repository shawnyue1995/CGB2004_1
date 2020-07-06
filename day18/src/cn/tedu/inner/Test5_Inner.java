package cn.tedu.inner;
//这个类用来测试内部类被static修饰
public class Test5_Inner {
    public static void main(String[] args) {
        /*Outer2.Inner2 in2=new Outer2().new Inner2();//报错，原因是Inner2是静态的内部类
        in2.shouin();
        System.out.println(in2.age);*/
        Outer2.Inner2 in2=new Outer2.Inner2();//Outer2.Inner2通过类名.调用类中的静态资源
        Outer2.Inner2.shouin();
        System.out.println(in2.age);
    }
}
class Outer2{
    String name="张三";
    public void showout(){
        System.out.println("showout()...");
    }
    //1，内部类被static修饰--随着类的加载而加载，会造成内存资源浪费，并不常用！
    static class Inner2{
        int age=18;
        public static void shouin(){
            System.out.println("shouin()...");
        }
    }
}