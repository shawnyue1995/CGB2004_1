package cn.tedu.io;

import java.io.*;

public class Test2_IO {
    public static void main(String[] args) {
        method();//jdk1.7֮ǰ
        method2();//jdk1.7֮��

    }

    public static void method2() {
        try (            BufferedReader in2=new BufferedReader(new FileReader("D:\\IOtest\\3.txt"));
                         BufferedWriter out2=new BufferedWriter(new FileWriter("D:\\IOtest\\4.txt"))
        ){//�Զ��ͷ���Դ

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
        BufferedInputStream in=null;//��Ϊfinally���Ѿ����������÷�Χ�ˣ�������Ҫ�ѱ����ķ�Χ����
        BufferedOutputStream out=null;
        BufferedReader in2=null;
        BufferedWriter out2=null;
        try {
            //��ȡ��Դ
            in=new BufferedInputStream(new FileInputStream("D:\\IOtest\\1.txt"));
            //д����Դ
            out=new BufferedOutputStream(new FileOutputStream("D:\\IOtest\\2.txt"));
            //�߶���д
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
        }finally {//���б���Ҫִ�еĴ���
            //�ͷ���Դ---��֤��Դ��һ���ᱻ�ͷ�
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
