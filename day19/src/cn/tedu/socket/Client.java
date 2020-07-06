package cn.tedu.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//�����������������ͨ�ſͻ���
//�ͻ��ˣ�������շ������˷��ص�����
//������������������
public class Client {
    public static void main(String[] args) {
        //1���������ӷ�����---ָ��Ҫ���ӵķ�������IP�Ͷ˿ں�
        //127.0.0.1�Ǳ�����IP��ַ��������Ҫд��ʵ��IP��ַ
        try {
            Socket sk=new Socket("127.0.0.1",8000);
        //2������������������---�ͻ�����out,��������in
            OutputStream out=sk.getOutputStream();
            //д��hello
            //ˢ��ȥ
            out.write("hello".getBytes());//������Ϊ�˰�Stringת��byte[]
            out.flush();

            //3����ȡ���������ص�����
            InputStream in=sk.getInputStream();
            for (int i = 0; i < 5; i++) {
                char c=(char)in.read();
                System.out.print(c);
            }
            sk.close();//�Ͽ�����

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
