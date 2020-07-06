package cn.tedu.inner;
//这个类用来测试匿名内部类
public class Test2_Inner {
    public static void main(String[] args) {
        //使用接口里的功能,new Inter()相当于创建了一个接口的实现类对象，只不过匿名对象
//        new Inter(){//匿名内部类---接口不能被实例化，但是配合匿名内部类可以
//            @Override
//            public void save() {
//                System.out.println("save()...");
//            }
//
//            @Override
//            public void get() {
//                System.out.println("get()...");
//            }
//
//        }.get();//调用指定方法---匿名内部类一次只干一件事
//        new Inter2(){//相当于创建了抽象类的对象
//
//            @Override
//            public void save() {
//
//            }
//        }.save();//调用指定方法
        Inter in=new Inter(){//给匿名内部类起个名字，就可以执行多个任务了
            @Override
            public void save() {
                System.out.println("save()...");
            }

            @Override
            public void get() {
                System.out.println("get()...");
            }

        };//调用两个方法
        in.get();
        in.save();
        new Inter2(){//相当于创建了抽象类的对象

            @Override
            public void save() {

            }
        }.save();//调用指定方法
    }
}
interface Inter{
    void save();
    void get();
}
//创建抽象类
//创建抽象类的匿名对象
abstract  class Inter2{
     public abstract  void save();
     public   void get(){
         System.out.println("get2()...");
     }
}