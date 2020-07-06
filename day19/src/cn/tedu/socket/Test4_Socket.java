package cn.tedu.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//�ͻ��˸�������������һ�����ݣ����������յ��󣬰����������ٷ��ظ��ͻ���
public class Test4_Socket {
    public static void main(String[] args) {
        try {
            //1������������
            ServerSocket server=new ServerSocket(8888);
            System.out.println("�������ѷ�������");

            //2����ȡ�ͻ��˵����ӣ�������ͨ��ͨ��
            Socket s=server.accept();
            System.out.println("�ͻ������ӳɹ�");

            //3������socket��ȡ˫����ֽ���
            InputStream in= s.getInputStream();
            OutputStream out=  s.getOutputStream();

            //4���ֽ���ת���ַ���---��һ��дһ��
            // BufferedReader/PrintWriter���ж�д�ķ���
            BufferedReader in2=new BufferedReader(new InputStreamReader(in));
            PrintWriter out2=new PrintWriter(new OutputStreamWriter(out));

            //5����ͻ���д��һ������
            String input=new Scanner(System.in).nextLine();
            out2.println(input);//д������
            out2.flush();//ˢ��
            //6����ȡ���������ص�����
            String line=in2.readLine();//��һ�У����û���ݣ�����null
            System.out.println(line);

            server.close();//�Ͽ�����
            s.close();//�ͷŶ˿�

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
