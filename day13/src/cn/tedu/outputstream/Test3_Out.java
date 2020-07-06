package cn.tedu.outputstream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
//这个类用来测试IO字节流写出
//总结：
//1、执行效率：BufferedOutputStream>FileOutputStream
//2、原因：底层维护了一个byte[]数组，按照数组的长度一次性读取一大批数据，默认容量是8192/8k
public class Test3_Out {
    public static void main(String[] args) {
        method();
        method2();
    }
    public static void method() {
        try {
            //1、创建对象--默认是覆盖模式，也可以改成追加模式,需要传入第二个参数true
            //OutputStream out=new FileOutputStream("D:\\IOtest\\1.txt");默认覆盖
            OutputStream out=new FileOutputStream("D:\\IOtest\\1.txt",true);
            //OutputStream out2=new FileOutputStream(new File("D:\\IOtest\\1.txt"));
            //2、开始写出
            out.write(51);
            out.write(52);
            out.write(53);
            //3、释放资源
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void method2() {
        try {
            //1、创建对象--默认是覆盖模式，也可以改成追加模式,需要传入第二个参数true
            //OutputStream out=new BufferedOutputStream(new FileOutputStream("D:\\IOtest\\2.txt");
            OutputStream out=new BufferedOutputStream(new FileOutputStream("D:\\IOtest\\2.txt",true));
            //2、开始写出
            out.write(51);
            out.write(52);
            out.write(53);
            //3、释放资源
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

