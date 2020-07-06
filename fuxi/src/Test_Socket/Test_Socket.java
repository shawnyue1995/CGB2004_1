package Test_Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test_Socket {
    public static void main(String[] args) {
        try {

                ServerSocket server = new ServerSocket(8889);
                System.out.println("服务器已发出连接");

                Socket ss = server.accept();
                System.out.println("客户端成功");

                InputStream in = ss.getInputStream();
                OutputStream out = ss.getOutputStream();

                BufferedReader in2 = new BufferedReader(new InputStreamReader(in));
                PrintWriter out2 = new PrintWriter(new OutputStreamWriter(out));

                System.out.println("请输入");
                String input = new Scanner(System.in).nextLine();
                out2.println(input);
                out2.flush();

                String line = in2.readLine();
                System.out.println(line);

            server.close();
           ss.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
