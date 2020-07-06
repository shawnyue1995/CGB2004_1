package cn.tedu.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//客户端给服务器发送来一行数据，服务器接收到后，把这行数据再返回给客户端
public class Test4_Socket {
    public static void main(String[] args) {
        try {
            //1、启动服务器
            ServerSocket server=new ServerSocket(8888);
            System.out.println("服务器已发出连接");

            //2、获取客户端的连接，并建立通信通道
            Socket s=server.accept();
            System.out.println("客户端连接成功");

            //3、根据socket获取双向的字节流
            InputStream in= s.getInputStream();
            OutputStream out=  s.getOutputStream();

            //4、字节流转成字符流---读一行写一行
            // BufferedReader/PrintWriter按行读写的方案
            BufferedReader in2=new BufferedReader(new InputStreamReader(in));
            PrintWriter out2=new PrintWriter(new OutputStreamWriter(out));

            //5、向客户端写出一行数据
            String input=new Scanner(System.in).nextLine();
            out2.println(input);//写出后换行
            out2.flush();//刷新
            //6、读取服务器返回的数据
            String line=in2.readLine();//读一行，如果没数据，返回null
            System.out.println(line);

            server.close();//断开连接
            s.close();//释放端口

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
