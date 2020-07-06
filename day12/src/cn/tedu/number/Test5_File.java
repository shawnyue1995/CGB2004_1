package cn.tedu.number;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

//这个类用来测试File
public class Test5_File {
    public static void main(String[] args) {
        File file=new File("D:\\iotest\\1.txt");
        //2、常见方法
        //文件文件夹属性
        System.out.println(file.length());//获取文件的字节量
        System.out.println(file.exists());//判断文件是否存在
        System.out.println(file.isFile());//判断是一个文件
        System.out.println(file.isDirectory());//判断是一个文件夹
        System.out.println(file.getName());////获取文件名称
        System.out.println(file.getParent());//获取父目录
        System.out.println(file.getAbsolutePath());//获取完整路径
        //创建	删除
        try {
            System.out.println(file.createNewFile());//是否成功新建文件
        } catch (IOException e) {
            e.printStackTrace();
        }

        file=new File("D:\\iotest\\m");//封装一个文件夹路径
        System.out.println(file.mkdir());//自动创建一级不存在的目录

        file=new File("D:\\iotest\\a\\b\\c\\d\\e\\f\\g\\h\\i\\j\\k\\m\\n");//封装一个文件夹路径
        System.out.println(file.mkdirs());//自动创建多级不存在的目录

        file=new File("\\iotest\\2.txt");
        System.out.println(file.delete());//删除文件 或  空文件夹
        //列表
        file = new File("D:\\iotest"); //封装一个文件夹路径
        String[] strings=file.list();//获取文件名并存入数组中
        System.out.println(Arrays.toString(strings));

        File[] files=file.listFiles();//获取每个文件并封装成File对象存入数组中
        System.out.println(Arrays.toString(files));
    }
}
