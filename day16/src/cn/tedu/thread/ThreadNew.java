package cn.tedu.thread;
//创建线程的方式三:实现callable接口,----jdk5.0新增
//如何理解实现Callable接口的方法创建多线程比实现Runnable接口创建多线程方式强大
//1.call()可以有返回值的
//2.call()可以跑出异常,被外卖的操作补货,获取异常信息
//3.callable是支持泛型的
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
//1.创建一个实现Callable接口的实现类
class NumberThread implements Callable<Integer>{
    //2.实现call方法,将此线程需要执行的操作声明在call()中
    @Override
    public Integer call() throws Exception {
            int sum=0;
        for (int i = 0; i <=100; i++) {
            if (i%2==0){
                System.out.println(i);
                sum +=i;
            }
        }
        return sum;
    }
}

public class ThreadNew {
    public static void main(String[] args) {

        //3.创建Callable接口实现类的对象
        NumberThread numberThread=new NumberThread();
        //4.将此Callable接口实现类的对象作为传递到FutureTask构造器中,创建FutureTask的对象
        FutureTask<Integer> futureTask= new FutureTask<Integer>(numberThread);
        //5.将FutureTask的对象作为参数传递到Thread类的构造器中,创建Thread对象,并调用start()
        new Thread(futureTask).start();
        try {
            //6.获取Callable中的call方法的返回值
            //get()方法的返回值即为futureTask构造器参数Callable实现类重写的call()的返回值
            Integer sum = futureTask.get();
            System.out.println("zonghe:"+sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
