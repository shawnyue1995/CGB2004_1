package Test_Socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Test_Client {
    public static void main(String[] args) {

        try {

                Socket socket = new Socket("127.0.0.1", 8889);

                InputStream in = socket.getInputStream();
                OutputStream out = socket.getOutputStream();

                BufferedReader in2 = new BufferedReader(new InputStreamReader(in));
                PrintWriter out2 = new PrintWriter(new OutputStreamWriter(out));

                String line = in2.readLine();
                System.out.println(line);

                System.out.println("«Î ‰»Î");
                String input = new Scanner(System.in).nextLine();
                out2.println(input);
                out2.flush();

            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
