package cn.tedu.thread;

/*������(Productor)����Ʒ������Ա(Clerk)����������(Customer)�ӵ�Ա��
ȡ�߲�Ʒ����Աһ��ֻ�ܳ��й̶������Ĳ�Ʒ(����:20���������������ͼ
��������Ĳ�Ʒ����Ա���������ͣһ�£���������п�λ�Ų�Ʒ����ͨ
֪�����߼����������������û�в�Ʒ�ˣ���Ա����������ߵ�һ�£���
�������в�Ʒ����֪ͨ��������ȡ�߲�Ʒ��
 */
//����
//�Ƿ��Ƕ��߳�����?��,�������߳�,�������߳�
//�Ƿ��й�������?(�̰߳�ȫ����)��,��Ա(���Ʒ)
//��ν���̰߳�ȫ����?ͬ������,���ַ���
//�Ƿ��漰�̵߳�ͨ��?��,�õ�wait��notify
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk =new Clerk();
        Producer p1= new Producer(clerk);
        p1.setName("������1");
        Producer p2= new Producer(clerk);
        p2.setName("������2");
        Consumer1 c1=new Consumer1(clerk);
        c1.setName("������1");

        p1.start();
        p2.start();
        c1.start();
    }
}
class Clerk{

    private int productCount=0;
    //������Ʒ
    public synchronized void produceProduct() {
        if (productCount<100){
            productCount++;
            System.out.println(Thread.currentThread().getName()+":��ʼ������"+productCount+"����Ʒ");
            notify();
        }else{
            //�ȴ�
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
//���Ѳ�Ʒ
    public synchronized void consumeProduct() {
        if (productCount>0){
            System.out.println(Thread.currentThread().getName()+":��ʼ���ѵ�"+productCount+"����Ʒ");
            productCount--;

            notify();
        }else{
            //�ȴ�
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Producer extends Thread{//������
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"��ʼ������Ʒ");
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
class Consumer1 extends Thread{//������
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
