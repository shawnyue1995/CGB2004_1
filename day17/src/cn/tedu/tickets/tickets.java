package cn.tedu.tickets;

public class tickets {
    public static void main(String[] args) {
        MyTickets t=new MyTickets();
        //第一个参数是要绑定的Runnable实现类对象，第二个参数是线程名称
        MyTickets t2=new MyTickets();
        MyTickets t3=new MyTickets();
        MyTickets t4=new MyTickets();
        Thread th1=new Thread(t,"窗口1");
        Thread th2=new Thread(t2,"窗口2");
        Thread th3=new Thread(t3,"窗口3");
        Thread th4=new Thread(t4,"窗口4");
        th1.start();
        th2.start();
        th3.start();
        th4.start();

    }
}
class MyTickets implements Runnable{
     static int tickets=100;//定义变量，记录票数
    Object obj=new Object();
    @Override
    // 4、锁方法，把方法整体都锁起来，虽然降低访问效率但是提高了安全性。默认使用的锁对象是this
    //  synchronized public void run(){
     public void run() {
        while (true){//一直卖票
            //1、可以把有线程安全隐患的 代码 锁起来--同步的锁代码块
            //2、锁的位置：要合理，不能太大也不能太小。建议从共享资源开始位置，一直到使用刚结束都锁起来
            //3、锁的对象：锁代码块的锁对象可以是任意对象，只要是同一个对象就可以。
            //synchronized (new Object()){//没锁住？？线程间使用的不是同一个锁对象，每个线程进来都new了一个自己的锁
            //synchronized (obj){//锁成功，因为多个线程使用的都是同一个Object对象。
            //synchronized (this){//如果共享资源是静态的，this锁不住，而是类名.class
            synchronized (MyTickets.class){
                if (tickets>0){//有票就卖
                    try {
                        Thread.sleep(10);//让程序休眠10ms
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+ "正在卖票,还剩" + (tickets--) + "张票");
                }else {
                    System.out.println("票已卖完");
                    break; //结束死循环
                }
            }
        }
    }
}
