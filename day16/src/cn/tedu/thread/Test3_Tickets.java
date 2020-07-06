package cn.tedu.thread;
//这个类用来测试 多线程售票
public class Test3_Tickets {
    public static void main(String[] args) {
        //创建多线程对象
        MyTickets t=new MyTickets();
        MyTickets t2=new MyTickets();
        MyTickets t3=new MyTickets();
        MyTickets t4=new MyTickets();
        Thread th=new Thread(t);
        Thread th2=new Thread(t2);
        Thread th3=new Thread(t3);
        Thread th4=new Thread(t4);
        th.start();
        th2.start();
        th3.start();
        th4.start();
        //问题1：需求是卖100张票，目前卖了400张，为什么？
        // 因为Tickets是实例对象，每次new都会给对象初始化，4个对象，就初始化了4次
        //如果能把tickets变成多个对象共享就可以了
    }
}
//1、模拟多线程开发
class MyTickets implements   Runnable{
    //定义变量，记录100张票
//    int tickets=100;//实例变量，会new多次就拥有多张票
    static  int tickets=100;//变量共享资源
    Object obj=new Object();
    //开始卖票，写进run()
    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if (tickets>0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //超卖：
                    //假设t1先醒，开始卖票，当前tickets=1，tickets--，输出1，然后自减变成0
                    //假设t2又醒，开始卖票，当前tickets=0，tickets--，输出0，然后自减变成-1
                    //假设t3又醒，开始卖票，当前tickets=-1，tickets--，输出-1，然后自减变成-2
                    //假设t4又醒，开始卖票，当前tickets=-2，tickets--，输出-2，然后自减变成-3
                    //重卖：
                    //假设t1先醒，开始卖票，当前tickets=1，tickets--，输出1，还没来得及改呢！！
                    //假设t2又醒，开始卖票，当前tickets=1，tickets--，输出1，还没来得及改呢！！
                    //假设t3又醒，开始卖票，当前tickets=1，tickets--，输出1，还没来得及改呢！！
                    //假设t4又醒，开始卖票，当前tickets=1，tickets--，输出1，还没来得及改呢！！
                    //Thread.currentThread().getName()获取正在执行任务的线程的名称
                    System.out.println(Thread.currentThread().getName()+ "正在卖票,还剩" + (tickets--) + "张票");
                }else {
                    System.out.println("票已经卖完！");
                    break;//票数<=0结束
                }
            }
        }

    }
}
