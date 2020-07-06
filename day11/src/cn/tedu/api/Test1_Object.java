package cn.tedu.api;

import java.util.Objects;

//这个类用来测试	Object的使用
//总结：在打印引用对象的时候，默认打印的就是地址值（原因是自动调用Object里的toString（）...），但是如果想要打印属性值，就必须重写toString()...
public class Test1_Object {
    public static void main(String[] args) {
        //创建对象测试
        Student stu=new Student("张三",25);
        //想查看对象的属性值，但不想一个一个去get（）
        //system.out.println(s.getName+s.getAge);
        //底层默认调用了Object的toString（），默认打印了对象的地址值
        //需要重写父类原有的toString()
        System.out.println(stu);
        System.out.println(stu.hashCode());
        Class c=stu.getClass();//返回该对象的class类型
        System.out.println(c);
        Student stu2=new Student("张三",25);
        System.out.println(stu.equals(stu2));
        // == 比较基本类型时，直接比值本身。 比较引用类型时，比较的是地址值
        // 6、需求：别再比较两个对象的地址值了！！需要去比较两个对象间的属性值
        // 如果两个对象的每个属性值都完全一样，就让equals()认为两个对象是相同的，返回true
    }
}
//创建Student类
//class Student extendes Object{//1、每个类都继承了Object
class Student {
    private String name;
    private int age;
    // 3、目前equals比较的是两个对象间的地址值！我想要比较对象间的属性值！！
			/*
			@Override
			public boolean equals(Object obj) {
				//把参数转成Student类型，是为了同一类型作比较
				Student param = (Student) obj ;
				//开始比较，拿着两个对象的属性比较
				if( this.name == param.name &&  this.age==param.age ) {
					return  true;//当两个对象的属性值完全相同时，就是同一个对象！！
				}
				return false;
			}*/
//右键-source--hashCode() and equals()... ok
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    //2、想要打印属性值而不是默认的地址值，需要重写Object的toString()
    //右键-source-toString()...-ok
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}