package ProductTest;

import com.oracle.jrockit.jfr.Producer;

import java.util.function.Consumer;

/*生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处
取走产品，店员一次只能持有固定数量的产品(比如:100），如果生产者试图
生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品了再通
知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如
果店中有产品了再通知消费者来取走产品。
 */
//分析
//是否是多线程问题?是,生产者线程,消费者线程
//是否有共享数据?(线程安全问题)是,店员(或产品)
//如何解决线程安全问题?同步机制,三种方法
//是否涉及线程的通信?是,用到wait和notify
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk=new Clerk();
        Producer1 p1=new Producer1(clerk);
        Consumer1 c1=new Consumer1(clerk);
        p1.setName("生产者");
        c1.setName("消费者");
        p1.start();
        c1.start();
    }
}
class Clerk{
    private  int count=0;
    public synchronized void produceProduct() {
        if (count<100){
            count++;
            System.out.println(Thread.currentThread().getName()+":正在生产第"+count+"个产品");
            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumerProduct() {
        if (count>0){
            System.out.println(Thread.currentThread().getName()+":正在消费第"+count+"个产品");
            count--;
            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Producer1 extends Thread{
    private Clerk clerk;

    public Producer1(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        super.run();
        System.out.println(getName()+":正在生产产品");
        while (true){
            try {
            Thread.sleep(10);
            clerk.produceProduct();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}
class Consumer1 extends  Thread{
    private Clerk clerk;

    public Consumer1(Clerk clerk) {
        this.clerk = clerk;
    }    @Override
    public void run() {
        super.run();
        System.out.println(getName()+":正在消费产品");
        while (true){
            try {
                Thread.sleep(10);
                clerk.consumerProduct();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}