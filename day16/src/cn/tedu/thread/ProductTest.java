package cn.tedu.thread;

/*生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处
取走产品，店员一次只能持有固定数量的产品(比如:20），如果生产者试图
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
        Clerk clerk =new Clerk();
        Producer p1= new Producer(clerk);
        p1.setName("生产者1");
        Producer p2= new Producer(clerk);
        p2.setName("生产者2");
        Consumer1 c1=new Consumer1(clerk);
        c1.setName("消费者1");

        p1.start();
        p2.start();
        c1.start();
    }
}
class Clerk{

    private int productCount=0;
    //生产产品
    public synchronized void produceProduct() {
        if (productCount<100){
            productCount++;
            System.out.println(Thread.currentThread().getName()+":开始生产第"+productCount+"个产品");
            notify();
        }else{
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
//消费产品
    public synchronized void consumeProduct() {
        if (productCount>0){
            System.out.println(Thread.currentThread().getName()+":开始消费第"+productCount+"个产品");
            productCount--;

            notify();
        }else{
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Producer extends Thread{//生产者
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始生产产品");
        while(true){
            try {
                Thread.sleep(20);
                clerk.produceProduct();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Consumer1 extends Thread{//消费者
    private Clerk clerk;

    public Consumer1(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(10);
                clerk.consumeProduct();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
