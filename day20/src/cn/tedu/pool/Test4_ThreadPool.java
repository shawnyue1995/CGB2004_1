package cn.tedu.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//��������������̳߳�
public class Test4_ThreadPool {
    public static void main(String[] args) {
        //1�������̳߳ض���---�������̳߳صĴ�С���߳�����
       ExecutorService pool= Executors.newFixedThreadPool(3);
        //2�������̳߳�ִ������
        //execute();//������Ҫrunnable�ӿ�����---����ֱ�Ӵ���  ��������+�����ڲ���
        for (int i = 0; i <3; i++) {//ѭ��3�Σ��ͻ�ִ��3�Σ���Ϊexecu��ִ����3��
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i <100 ; i++) {
                        System.out.println(Thread.currentThread().getName()+"==="+i);
                        }
                    }
                }
            );
        }

    }
}
