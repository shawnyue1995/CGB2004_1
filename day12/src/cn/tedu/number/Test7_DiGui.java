package cn.tedu.number;

import java.io.File;
import java.util.Scanner;

public class Test7_DiGui {
    public static void main(String[] args) {
        //1、接收用户输入的文件夹路径
        System.out.println("请输入文件的路径：");
        String path=new Scanner(System.in).nextLine();
        //2、把文件封装成File对象
        File dir=new File(path);
        //调用del（）方法删除文件
        del(dir);
    }
//创建del（）方法
    public static void del(File dir) {
        //列出所有资源
        File[] files=dir.listFiles();
        //拿到每个资源，开始判断
        for (int i = 0; i <files.length ; i++) {
            File file=files[i];//当前获取到的资源
            if (file.isFile()){//是文件
                file.delete();//删除
            }else if (file.isDirectory()){//是文件夹
                del(file);//递归
            }
        }
        dir.delete();//删除空文件夹
    }
}
