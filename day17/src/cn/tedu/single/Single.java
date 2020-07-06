package cn.tedu.single;
//饿汉式
public class Single {
    public static void main(String[] args) {
        //MySingle s=new MySingle();//私有化的构造方法无法创建对象
        MySingle my=MySingle.getMy();
        MySingle my2=MySingle.getMy();
        System.out.println(my==my2);//==用来比较引用类型变量保存着的地址值
        //现在的程序有共享资源吗？---有 s
        //有安全隐患吗？---没有，因为多线编程中，是会被多条语句操作时，才会有安全隐患
    }
}
//创建自己的类
class MySingle{
    //1、私有化构造方法---目的是不让外界随意new
    private MySingle(){
    }
    //2、在类的内部创建对象---修饰成static是因为，getMy（）是静态的，要关联的资源也必须是静态的
    static MySingle s=new MySingle();
    //3、提供公共的访问点---修饰成static是因为外界无法通过对象访问，现在可以通过类名访问
    public static MySingle getMy(){
        return s;//把自己创建好的对象返回给外界调用位置
    }
}