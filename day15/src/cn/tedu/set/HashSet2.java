package cn.tedu.set;

import java.util.Objects;

//这个类用来测试   利用set集合去重
//总结：
// 1、set集合常用于去重
// 2、如果想用set集合给自定义的对象去重，需要同时提供重写的hashcode（）,equals（）
//3、重写hashcode：是为了让底层运算哈希值时，可以根据对象的属性运算
//如果两个对象属性值一样，即将得到相同的hash值
//4、重写equals:是为了让底层判断两个对象是否相等时，可以根据对象间的属性值判断
//如果两个对象属性值相同，就认为时相等的，让equals()返回true
public class HashSet2 {
    public static void main(String[] args) {
        //1、创建HashSet对象
        java.util.HashSet<Student>  hs3=new java.util.HashSet<>();
        Student s1=new Student("张三",20);
        Student s2=new Student("李四",21);
        Student s3=new Student("王五",22);
        //2、加入Set中
        hs3.add(s1);
        hs3.add(s2);
        hs3.add(s3);
        //3、Set不是可以去重吗？---能不能把自定义的对象去重？---暂时没去重
        Student s4=new Student("王五",22);
        //4、怀疑add()在添加自定义的对象时，没有根据属性去重
        //if (p.hash == hash && ((k = p.key) == key || (key != null && key.equals(k))))
        //5、为了使两个对象间的hash值一致，我们需要把只要new一次就计算一个hash值这种默认实现方式改掉。
        //这时，需要重写hashCode()让此方法运算出来的hash值可以根据对象的属性值运算。
        hs3.add(s4);
        //System.out.println(s3.hashCode());
        //System.out.println(s4.hashCode());
        System.out.println(hs3);
    }
}
class Student{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    //6、为了让两个对象间，比较属性值，需要提供重写的equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                name.equals(student.name);
    }
    //5、为了使两个对象间的hash值一致，我们需要把只要new一次就计算一个hash值这种默认实现方式改掉。
    //这时，需要重写hashCode()让此方法，运算出来的hash值可以根据对象的属性值运算。
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}