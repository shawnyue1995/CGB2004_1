package cn.tedu.inner;
//这个类用来测试内部类
public class Test4_Inner {
    public static void main(String[] args) {
        //1、创建内部类对象，使用内部类资源
        //外部类名.内部类名  变量 =外部类对象.内部类对象
       Outer.Inner in=new Outer().new Inner();
        in.showIn();
        System.out.println(in.age);

           new Outer().showOut();
    }
}
class Outer{//外部类
    //2，如果想要访问private的内部类，可以访问外部类提供的对应方法
    String name="张三";
    public void showOut(){
        System.out.println("showOut()...");
        //在外部类访问内部类资源---不可以直接调用，创建内部类对象来调用
        new Inner().showIn();
    }
    //位置在类里方法外--成员内部类
    //1，内部类可以被private修饰，但是外界无法直接创建对象了！
    public class Inner{//内部类
        public void showIn(){
            //内部类里，可以使用外部类的资源吗
//            showOut();
            System.out.println("showIn()...");
        }

        int age=99999;
    }
}
