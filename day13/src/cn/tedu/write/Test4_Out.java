package cn.tedu.write;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
//这个类用来测试IO字符流写出
//总结：
//1、执行效率：BufferedOutputStream>FileOutputStream
//2、原因：底层维护了一个byte[]数组，按照数组的长度一次性读取一大批数据，默认容量是8192/8k
public class Test4_Out {
    public static void main(String[] args) {
        method();
        method2();
    }

    public static void method2() {
        try {
            //1、创建对象--默认是覆盖模式，也可以改成追加模式,需要传入第二个参数true
            Writer w=new FileWriter("D:\\IOtest\\1.txt",true);
            //Writer w2=new FileWriter(new File("D:\\IOtest\\1.txt"));
            //2、开始写出
            w.write(97);
            w.write(98);
            w.write(99);
            //3、释放资源
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method() {
        try {
            //1、创建对象--默认是覆盖模式，也可以改成追加模式,需要传入第二个参数true
            //Writer w=new BufferedWriter(new FileWriter("D:\\IOtest\\2.txt"));
            Writer w=new BufferedWriter(new FileWriter("D:\\IOtest\\2.txt",true));
            //2、开始写出
            w.write("hello");
            //3、释放资源
            w.flush();//用来把缓冲区的数据刷到磁盘中做展示
            //w.close();1、把数据刷出去2、关闭资源
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
