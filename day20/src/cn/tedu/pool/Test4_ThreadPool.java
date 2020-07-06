package cn.tedu.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//这个类用来测试线程池
public class Test4_ThreadPool {
    public static void main(String[] args) {
        //1、创建线程池对象---参数是线程池的大小（线程数）
       ExecutorService pool= Executors.newFixedThreadPool(3);
        //2、利用线程池执行任务
        //execute();//参数需要runnable接口类型---我们直接传入  匿名对象+匿名内部类
        for (int i = 0; i <3; i++) {//循环3次，就会执行3次，因为execu被执行了3次
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
