package cn.tedu.single;
//懒汉式
public class Single2 {
    public static void main(String[] args) {
        MySingle2 m=MySingle2.getmy();
        MySingle2 m2=MySingle2.getmy();
        System.out.println(m==m2);
        //有共享资源吗？---有 m
        //有安全隐患吗？---有多条语句操作了共享数据，如果是多线程编程，一定有隐患，---加锁
    }
}
class MySingle2{
    private MySingle2(){
    }
    static MySingle2 m=new MySingle2();
    //修饰成synchronize方法，是用来解决线程安全隐患问题，降低了效率
     synchronized public static MySingle2 getmy(){
        if (m==null){//增强代码的健壮性
            m=new MySingle2();//延迟访问，延迟加载
        }
        return m;
    }
}