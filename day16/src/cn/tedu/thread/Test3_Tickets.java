package cn.tedu.thread;
//������������� ���߳���Ʊ
public class Test3_Tickets {
    public static void main(String[] args) {
        //�������̶߳���
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
        //����1����������100��Ʊ��Ŀǰ����400�ţ�Ϊʲô��
        // ��ΪTickets��ʵ������ÿ��new����������ʼ����4�����󣬾ͳ�ʼ����4��
        //����ܰ�tickets��ɶ��������Ϳ�����
    }
}
//1��ģ����߳̿���
class MyTickets implements   Runnable{
    //�����������¼100��Ʊ
//    int tickets=100;//ʵ����������new��ξ�ӵ�ж���Ʊ
    static  int tickets=100;//����������Դ
    Object obj=new Object();
    //��ʼ��Ʊ��д��run()
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
                    //������
                    //����t1���ѣ���ʼ��Ʊ����ǰtickets=1��tickets--�����1��Ȼ���Լ����0
                    //����t2���ѣ���ʼ��Ʊ����ǰtickets=0��tickets--�����0��Ȼ���Լ����-1
                    //����t3���ѣ���ʼ��Ʊ����ǰtickets=-1��tickets--�����-1��Ȼ���Լ����-2
                    //����t4���ѣ���ʼ��Ʊ����ǰtickets=-2��tickets--�����-2��Ȼ���Լ����-3
                    //������
                    //����t1���ѣ���ʼ��Ʊ����ǰtickets=1��tickets--�����1����û���ü����أ���
                    //����t2���ѣ���ʼ��Ʊ����ǰtickets=1��tickets--�����1����û���ü����أ���
                    //����t3���ѣ���ʼ��Ʊ����ǰtickets=1��tickets--�����1����û���ü����أ���
                    //����t4���ѣ���ʼ��Ʊ����ǰtickets=1��tickets--�����1����û���ü����أ���
                    //Thread.currentThread().getName()��ȡ����ִ��������̵߳�����
                    System.out.println(Thread.currentThread().getName()+ "������Ʊ,��ʣ" + (tickets--) + "��Ʊ");
                }else {
                    System.out.println("Ʊ�Ѿ����꣡");
                    break;//Ʊ��<=0����
                }
            }
        }

    }
}
