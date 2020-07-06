package cn.tedu.io;
/*
--BufferedReader
		--readLine()  专门用来读取一行数据
	--PrintWriter
		--println()  专门用来写出一行数据
 */
import java.io.*;

public class Test7 {
    public static void main(String[] args) throws IOException {
        //1、创建读取流对象，负责一行一行读取
            BufferedReader in = new BufferedReader(new FileReader("D:\\IOtest\\1.txt"));
            //2、创建写出流对象，负责一行一行写出
            PrintWriter out=new PrintWriter(new FileWriter("D:\\IOtest\\2.txt"));
            //3、读一行写一行
            String line;//保存读取到的一行数据，readLine()如果没有读取到就是null
            while ((line=in.readLine())!=null) {
                //println()把读取到的数据line一行一行写出
                out.println(line);
            }
        //4、释放资源
        in.close();
        out.close();
    }
}
