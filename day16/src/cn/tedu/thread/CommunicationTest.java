package cn.tedu.thread;
/*
    线程通信的例子:使用两个线程打印1-100,线程1,线程2交替打印

    涉及到的方法:
    wait():一旦执行此方法,当前线程就进入阻塞状态,并释放同步监视器
    notify():一旦执行此方法,就会唤醒被wait的线程,如果有多个线程被wait就会唤醒优先级搞得那个
    notifyAll():一旦执行此方法,就会唤醒所有被wait的线程

    说明:
    1.wait(),notify(),notifyALl()这三个方法必须使用在同步代码块或同步方法中
    2.wait(),notify(),notifyALl()这三个方法调用者必须是同步代码块或者同步方法中的同步监视器
    否则会发生异常
    3.这三个方法是定义在java.lang.Object包下

    sleep和wait方法的区别
    1.相同点:一旦执行这个方法,都可以使得当前线程进入阻塞状态
    2.不同点:1)两个方法声明的位置不同,Thread类中声明sleep(),Object类中声明wait()
            2)调用的要求不同:sleep可以再任何需要的场景下调用,wait()方法必须使用在同步代码快或同步方法当中
            3)如果两个方法都使用在同步代码快或同步方法中,sleep()不会释放同步监视器,wait()会释放同步监视器
 */
public class CommunicationTest {
    public static void main(String[] args) {
        //4.创建线程对象
        Number number=new Number();
        //5.绑定线程接口和thread类的关系
        Thread t1= new Thread(number );
        Thread t2= new Thread(number );
        Thread t3= new Thread(number );
        //6.设置线程名称
        t1.setName("线程1");
        t2.setName("线程2");
        t3.setName("线程3");
        //7.启动线程
        t1.start();
        t2.start();
        t3.start();

    }
}
//1.创建多线程类number
class Number implements  Runnable{
    //定义第一个值为1
    private  int number=1;
    private Object obj=new Object();
    //2.重写run方法
    @Override
    public void run() {
        while(true){

            synchronized (obj) {

                    obj.notify();//唤醒
//                notifyAll();//唤醒所有的
                if (number <= 100) {

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //3.输出线程名称
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        //使得调用如下wait方法的线程进入阻塞状态
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
            }
        }

    }

