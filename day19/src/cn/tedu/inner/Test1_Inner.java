package cn.tedu.inner;
//这个类用来测试private/static内部类
public class Test1_Inner {
    public static void main(String[] args) {
        //创建内部类对象
/*        Outer.Inner in=new Outer().new Inner();//内部类被封装了，无法直接new
        in.showIn();*/
//触发showOut()方法
    new Outer().showOut();
    //6、使用Inner2的资源---可以直接通过外部类名.内部类名来定位内部类
        Outer.Inner2 in2=new Outer.Inner2();
        in2.showIn2();
        //7、访问静态内部类里的静态方法
        Outer.Inner2.showIn2();
    }
}
class Outer{
    String name;
    public void showOut(){
        //3、间接访问showIn()
        new Inner().showIn();
        System.out.println("shouOut()...");
    }
    //1、在成员位置的内部类叫成员内部类。可以被private修饰，也可以被static修饰
        class Inner{
        int age;
        private void showIn(){
            System.out.println("showIn()...张三");
        }
    }
    //5、内部类被static修饰
    static class Inner2{
          int count=10;
        static void showIn2(){

            System.out.println("showIn2()...");
        }
    }
}