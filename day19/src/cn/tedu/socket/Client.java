package cn.tedu.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//这个类用来测试网络通信客户端
//客户端：负责接收服务器端发回的连接
//并给服务器发送数据
public class Client {
    public static void main(String[] args) {
        //1、尝试连接服务器---指定要连接的服务器的IP和端口号
        //127.0.0.1是本机的IP地址，工作中要写真实的IP地址
        try {
            Socket sk=new Socket("127.0.0.1",8000);
        //2、给服务器发送数据---客户端是out,服务器是in
            OutputStream out=sk.getOutputStream();
            //写出hello
            //刷出去
            out.write("hello".getBytes());//参数是为了把String转成byte[]
            out.flush();

            //3、读取服务器返回的数据
            InputStream in=sk.getInputStream();
            for (int i = 0; i < 5; i++) {
                char c=(char)in.read();
                System.out.print(c);
            }
            sk.close();//断开连接

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
