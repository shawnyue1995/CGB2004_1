package objectstream;

import java.io.*;

public class ObjectStream {
    public static void main(String[] args) {
        method();//反序列化
        method2();//序列化
    }

    public static void method2() {
        Student stu=new Student("李四",18);
        ObjectOutputStream out=null;
        try {
            out=new ObjectOutputStream(new FileOutputStream("D:\\IOtest\\1.txt"));
            out.writeObject(stu);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void method() {
        ObjectInputStream in=null;
        try {
            in=new ObjectInputStream(new FileInputStream("D:\\IOtest\\1.txt"));
            Object read=in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
class Student implements Serializable{
    private static final long serialVersionUID = -7311887973657715511L;
    private  String name;
    private int age;

    public Student(String 张三, int i) {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
