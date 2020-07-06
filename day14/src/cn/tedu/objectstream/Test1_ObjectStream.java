package cn.tedu.objectstream;

import java.io.*;
//这个类用来测试 序列化  反序列化
public class Test1_ObjectStream {
    public static void main(String[] args) {
        method();//序列化
        method2();//反序列化
    }
    //序列化：把Java对象， 输出 ，永久保存到磁盘中
    public static void method() {
        Student stu=new Student();
        try {
            //创建序列化对象
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("D:\\IOtest\\1.txt"));
            //开始序列化
            out.writeObject(stu);
            //释放资源
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //反序列化：把磁盘中已经序列化好的文件，读取，恢复成Java对象
    public static void method2() {
        try {
            //创建反序列化对象
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:\\IOtest\\1.txt"));
            try {
                //开始反序列化
                Object obj=in.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            //释放资源
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//创建Student
//1、如果你的文件，想要支持序列化，必须实现Serializable接口，算是开启了序列化功能
//否则：java.io.NotSerializableException: cn.tedu.io.Student
class Student implements Serializable{
    private String name;
    private int age;

    /**
     *
     */
    //2、自动生成此文件的唯一标识，版本号id
    private static final long serialVersionUID = 1L;
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}