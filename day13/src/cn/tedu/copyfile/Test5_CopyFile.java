package cn.tedu.copyfile;

import java.io.*;
//这个类用来测试文件复制---最高效的字节流
public class Test5_CopyFile {
    public static void main(String[] args) {
        method();//字节流
        method2();//字符流
    }

    public static void method() {

        try {
            //1、读取源文件数据
            InputStream in=new BufferedInputStream(new FileInputStream("D:\\IOtest\\1.txt"));
            //2、写出数据到指定文件
            OutputStream  out = new BufferedOutputStream(new FileOutputStream("D:\\IOtest\\2.txt"));
            int b=0;//定义变量，记录读取到的数据
            while((b=in.read())!=-1){
                out.write(b);//把读取的数据同时写出---边读边写
            }
            //4、释放数据
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method2() {
        try {
            //1、读取源文件数据
        Reader in=new BufferedReader(new FileReader("D:\\IOtest\\3.txt"));
            //2、写出数据到指定文件
        Writer out=new BufferedWriter(new FileWriter("D:\\IOtest\\4.txt"));
            //3、读取数据
        int b=0;//定义变量，记录读取到的数据
        while((b=in.read())!=-1){
            out.write(b);//把读取的数据同时写出---边读边写
        }
        in.close();
        out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
