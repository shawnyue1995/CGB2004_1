package cn.tedu.io;

import java.io.*;

public class Test2_IO {
    public static void main(String[] args) {
        method();//jdk1.7之前
        method2();//jdk1.7之后

    }

    public static void method2() {
        try (            BufferedReader in2=new BufferedReader(new FileReader("D:\\IOtest\\3.txt"));
                         BufferedWriter out2=new BufferedWriter(new FileWriter("D:\\IOtest\\4.txt"))
        ){//自动释放资源

            int b2;
            while ((b2=in2.read())!=-1){
                out2.write(b2);
            }
            in2.close();
            out2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method() {
        BufferedInputStream in=null;//因为finally里已经变量的作用范围了，所以需要把变量的范围扩大
        BufferedOutputStream out=null;
        BufferedReader in2=null;
        BufferedWriter out2=null;
        try {
            //读取资源
            in=new BufferedInputStream(new FileInputStream("D:\\IOtest\\1.txt"));
            //写出资源
            out=new BufferedOutputStream(new FileOutputStream("D:\\IOtest\\2.txt"));
            //边读边写
            int b;
            while((b=in.read())!=-1){
                out.write(b);
            }
             in2=new BufferedReader(new FileReader("D:\\IOtest\\1.txt"));
             out2=new BufferedWriter(new FileWriter("D:\\IOtest\\1.txt"));
            int b2;
            while ((b2=in2.read())!=-1){
                out2.write(b2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {//我有必须要执行的代码
            //释放资源---保证资源被一定会被释放
            if (in!=null) {
                try {
                    in.close();
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
