package cn.tedu.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//这个类用来测试网络通信服务器端
//服务器端：负责接收客户端发来的连接请求
//并给客户端做出响应
//需求：
//服务器端接收客户端发来的hello
//并给客户端发送world
public class Test3_Socket {
    public static void main(String[] args) {
        //1、在指定端口启动服务器---是指在8000端口号的位置，等待客户端来连接
        //端口号包括0~65535，其中0~1024被系统占用
        try {
            ServerSocket ss=new ServerSocket(8000);//指定端口号
            System.out.println("服务器已启动，等待客户端的连接！");
            //2、接收客户端的连接请求---并建立数据连接通道
            //阻塞方法 --- 一直死等客户端的连接
            Socket s=ss.accept();
            System.out.println("客户端连接成功！");
            //3、取出双向的流
            InputStream in=s.getInputStream();
            //4、通信
            //接收客户端发送过来的hello
            for (int i = 0; i < 5; i++) {
                //一个一个字节传
                char c=(char)in.read();//想读取字符本身
                System.out.print(c);//同行展示
            }
            //给客户端返回数据
            OutputStream out=s.getOutputStream();
            out.write("world".getBytes());
                out.flush();//输出缓存

                //释放资源
                ss.close();//断开连接
                s.close();//释放端口

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
