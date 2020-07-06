package cn.tedu.number;

import java.io.File;
import java.util.Scanner;
//这个类用来测试 递归
public class Test6_DiGui {
    public static void main(String[] args) {
        //1、接收用户输入的文件路径
        String path=new Scanner(System.in).nextLine();
        //2、封装成File对象
        File dir=new File(path);
        //3、调用size()求大小
        long res=size(dir);
        System.out.println(res);
    }
//4、创建size()
    public static long size(File dir) {
//列出文件夹里的所有资源
        File[] files=dir.listFiles();
        //拿到每个资源开始判断
        long sum=0;//定义变量，记录字节量的和
        for (int i = 0; i <files.length ; i++) {
            File file=files[i];//file表示当前获取到的资源
            //		3、判断，如果是文件，直接length()求和
            if (file.isFile()){//是文件
                sum=sum+file.length();
//		4、判断，如果是文件夹，开始重复的干   1   2   3  4  这几步。。。
            }else if(file.isDirectory()){//是文件夹
                sum=sum+size(file);//递归，因为业务开始和size方法一样了
            }
        }
        return sum;//把最终统计好的结果 返回给调用位置
    }

}
