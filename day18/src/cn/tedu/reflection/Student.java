package cn.tedu.reflection;

public class Student {
    //提供一些类的资源

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

    public String name="彭于晏";
    public int age=20;

    public void show(){
        System.out.println("show()...");
    }

    public void add(int a){
        System.out.println("add()..."+a);
    }

}
