package cn.tedu.thread;
/*
    �߳�ͨ�ŵ�����:ʹ�������̴߳�ӡ1-100,�߳�1,�߳�2�����ӡ

    �漰���ķ���:
    wait():һ��ִ�д˷���,��ǰ�߳̾ͽ�������״̬,���ͷ�ͬ��������
    notify():һ��ִ�д˷���,�ͻỽ�ѱ�wait���߳�,����ж���̱߳�wait�ͻỽ�����ȼ�����Ǹ�
    notifyAll():һ��ִ�д˷���,�ͻỽ�����б�wait���߳�

    ˵��:
    1.wait(),notify(),notifyALl()��������������ʹ����ͬ��������ͬ��������
    2.wait(),notify(),notifyALl()���������������߱�����ͬ����������ͬ�������е�ͬ��������
    ����ᷢ���쳣
    3.�����������Ƕ�����java.lang.Object����

    sleep��wait����������
    1.��ͬ��:һ��ִ���������,������ʹ�õ�ǰ�߳̽�������״̬
    2.��ͬ��:1)��������������λ�ò�ͬ,Thread��������sleep(),Object��������wait()
            2)���õ�Ҫ��ͬ:sleep�������κ���Ҫ�ĳ����µ���,wait()��������ʹ����ͬ��������ͬ����������
            3)�������������ʹ����ͬ��������ͬ��������,sleep()�����ͷ�ͬ��������,wait()���ͷ�ͬ��������
 */
public class CommunicationTest {
    public static void main(String[] args) {
        //4.�����̶߳���
        Number number=new Number();
        //5.���߳̽ӿں�thread��Ĺ�ϵ
        Thread t1= new Thread(number );
        Thread t2= new Thread(number );
        Thread t3= new Thread(number );
        //6.�����߳�����
        t1.setName("�߳�1");
        t2.setName("�߳�2");
        t3.setName("�߳�3");
        //7.�����߳�
        t1.start();
        t2.start();
        t3.start();

    }
}
//1.�������߳���number
class Number implements  Runnable{
    //�����һ��ֵΪ1
    private  int number=1;
    private Object obj=new Object();
    //2.��дrun����
    @Override
    public void run() {
        while(true){

            synchronized (obj) {

                    obj.notify();//����
//                notifyAll();//�������е�
                if (number <= 100) {

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //3.����߳�����
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        //ʹ�õ�������wait�������߳̽�������״̬
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

