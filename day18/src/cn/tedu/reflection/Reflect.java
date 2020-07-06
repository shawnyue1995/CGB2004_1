package cn.tedu.reflection;

public class Reflect {
    public String name;
    private int age;
//构造方法
    public Reflect() {
    }

    public Reflect(String name) {
        this.name = name;
    }

    public Reflect(int age) {
        this.age = age;
    }

    public Reflect(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println("show()...");
    }
    private void show2(String a,int b){
        System.out.println("show()..."+a+b);
    }

    @Override
    public String toString() {
        return "Reflect{" +
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
