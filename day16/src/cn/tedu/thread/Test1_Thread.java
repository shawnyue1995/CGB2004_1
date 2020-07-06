package cn.tedu.thread;
//这个类用来测试 多线程编程
public class Test1_Thread{
    public static void main(String[] args) {
        MyThread target=new MyThread(); //新建状态
        MyThread target2=new MyThread();//ctrl + d复制
        //6、开启线程--并执行线程run()里的业务
        target.start();//从新建状态变成了可运行状态，等待CPU调度
        target2.start();//7、可以执行业务，但是没有多线程效果，相当于是普通方法调用。
    }
}

//1、继承Thread类
class MyThread extends Thread{
    //2、把所有的业务放入run()------打印10次线程信息
    @Override
    public void run() {
//默认的：   super.run();
        //3、打印10次线程信息 --  fori提示普通循环
        for (int i = 0; i <10; i++) {
            //4、sout提示输出语句
            System.out.println(getName()+getId()+i);
        }
    }
}
