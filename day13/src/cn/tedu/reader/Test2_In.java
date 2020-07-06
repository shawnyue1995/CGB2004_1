package cn.tedu.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
//这个类用来测试IO字节流写入
//1、执行效率：BufferedReader>FileReader
//2、原因：底层维护了一个byte[]数组，按照数组的长度一次性读取一大批数据，默认容量是8192/8k
public class Test2_In {
    public static void main(String[] args) {
        method();
        method2();
    }
    public static void method() {
        //1、创建对象
        try {
            Reader in=new FileReader("D:\\IOtest\\1.txt");
            Reader in2=new FileReader(new File("D:\\IOtest\\1.txt"));
            //2、开始读取
            //定义变量，记录表读取到的数据
            int b=0;
            while ((b=in.read())!=-1) {
                System.out.println(b);
            }
            //3、释放资源
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void method2() {
        try {
            //1、创建对象
            Reader in=new BufferedReader(new FileReader("D:\\IOtest\\1.txt"));
            //2、开始读取
            //定义变量，记录表读取到的数据
            int b=0;
            while ((b=in.read())!=-1) {
                System.out.println(b);
            }
            //3、释放资源
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

