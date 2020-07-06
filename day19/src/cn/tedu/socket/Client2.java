package cn.tedu.socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) {
        try {
            //1、连接指定服务器
            Socket socket=new Socket("127.0.0.1",8888);

            //2、根据socket获取双向读写流
            OutputStream out=  socket.getOutputStream();
            InputStream in= socket.getInputStream();

            //3、字节流转成字符流---读一行写一行
            // BufferedReader/PrintWriter按行读写的方案
            BufferedReader in2=new BufferedReader(new InputStreamReader(in));
            PrintWriter out2=new PrintWriter(new OutputStreamWriter(out));

            //4、读取服务器发回来的数据
            String line=in2.readLine();//读一行，如果没数据，返回null
            System.out.println(line);
            //5、向服务器写出数据
            String input=new Scanner(System.in).nextLine();
            out2.println(input);//写出后换行
            out2.flush();//刷新

            socket.close();//断开连接

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
