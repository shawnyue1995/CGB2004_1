package cn.tedu.socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) {
        try {
            //1������ָ��������
            Socket socket=new Socket("127.0.0.1",8888);

            //2������socket��ȡ˫���д��
            OutputStream out=  socket.getOutputStream();
            InputStream in= socket.getInputStream();

            //3���ֽ���ת���ַ���---��һ��дһ��
            // BufferedReader/PrintWriter���ж�д�ķ���
            BufferedReader in2=new BufferedReader(new InputStreamReader(in));
            PrintWriter out2=new PrintWriter(new OutputStreamWriter(out));

            //4����ȡ������������������
            String line=in2.readLine();//��һ�У����û���ݣ�����null
            System.out.println(line);
            //5���������д������
            String input=new Scanner(System.in).nextLine();
            out2.println(input);//д������
            out2.flush();//ˢ��

            socket.close();//�Ͽ�����

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
