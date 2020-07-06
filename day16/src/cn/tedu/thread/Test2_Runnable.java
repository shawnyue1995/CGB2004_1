package cn.tedu.thread;
//这个类用来测试 多线编程
public class Test2_Runnable {
    public static void main(String[] args) {
        //4、创建线程对象
        MyRunnable target=new MyRunnable();
        //绑定Runnable接口和Thread类的关系
        Thread t=new Thread(target);
        Thread t1=new Thread(target);
        //设置线程名称
        t.setName("奥利给");
        t1.setName("！！！");
        //5、启动线程
        t.start();//可运行状态，等待调度
        t1.start();
    }
}
//1、创建多线程类
class MyRunnable implements Runnable{
    //2、把所有的业务，都放入重写的run()
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {

//            3、输出线程名称System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName()+"==="+i);
        }
    }
}