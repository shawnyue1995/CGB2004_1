package cn.tedu.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//�����������������ͨ�ŷ�������
//�������ˣ�������տͻ��˷�������������
//�����ͻ���������Ӧ
//����
//�������˽��տͻ��˷�����hello
//�����ͻ��˷���world
public class Test3_Socket {
    public static void main(String[] args) {
        //1����ָ���˿�����������---��ָ��8000�˿ںŵ�λ�ã��ȴ��ͻ���������
        //�˿ںŰ���0~65535������0~1024��ϵͳռ��
        try {
            ServerSocket ss=new ServerSocket(8000);//ָ���˿ں�
            System.out.println("���������������ȴ��ͻ��˵����ӣ�");
            //2�����տͻ��˵���������---��������������ͨ��
            //�������� --- һֱ���ȿͻ��˵�����
            Socket s=ss.accept();
            System.out.println("�ͻ������ӳɹ���");
            //3��ȡ��˫�����
            InputStream in=s.getInputStream();
            //4��ͨ��
            //���տͻ��˷��͹�����hello
            for (int i = 0; i < 5; i++) {
                //һ��һ���ֽڴ�
                char c=(char)in.read();//���ȡ�ַ�����
                System.out.print(c);//ͬ��չʾ
            }
            //���ͻ��˷�������
            OutputStream out=s.getOutputStream();
            out.write("world".getBytes());
                out.flush();//�������

                //�ͷ���Դ
                ss.close();//�Ͽ�����
                s.close();//�ͷŶ˿�

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
