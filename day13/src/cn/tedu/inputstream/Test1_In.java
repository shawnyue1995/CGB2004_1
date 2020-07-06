package cn.tedu.inputstream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//这个类用来测试IO字节流读取
//总结：
//1、执行效率：BufferedInputStream>FileInputStream
//2、原因：底层维护了一个byte[]数组，按照数组的长度一次性读取一大批数据，默认容量是8192/8k
public class Test1_In {
    public static void main(String[] args) {
        method();//FileInputStream字节流读取
        method2();//BufferedInputStream读取
    }
    //字节流读取
    public static void method() {
        //1、创建对象--参数是文件的路径
        try {

            InputStream in=new FileInputStream("D:\\IOtest\\1.txt");//触发String参数的构造
            InputStream in2=new FileInputStream(new File("D:\\IOtest\\1.txt"));//触发File参数的
            //2、开始读取
            //System.out.println(in.read());//97，由于读取到了字母a,而且read（）返回值是int类型
            //System.out.println(in.read());
            //	System.out.println(in.read());
            //	System.out.println(in.read());//由于没有数据了 ，所以read()返回-1
            //	System.out.println(in.read());
            //定义变量记录读取到的值
            int b=0;
            while ( (b=in.read())!=-1) {//因为读到-1时就没数据了
                System.out.println(b);
            }
            //3、释放资源
            in.close();
            //System.out.println(in.read());//Stream closed流关闭了
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void method2(){
        //1、创建对象
        try {
            InputStream in=new BufferedInputStream(new FileInputStream("D:\\IOtest\\1.txt"));
            //2、开始读取
            //定义变量记录读取到的值
            int b=0;
            //从文件中按字节读取内容，到文件尾部时read方法将返回-1
            while ((b=in.read())!=-1) {
                System.out.println(b);
            }
            //3、释放资源
            in.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }
}
