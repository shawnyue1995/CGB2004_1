package cn.tedu.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

//这个类用来测试 底层 反射
public class Test1_Reflect {
    public static void main(String[] args) {
        method();//反射class对象
        method2();//反射构造方法
        method3();//反射普通方法
        method4();//反射成员变量
        method5();//反射创建对象
    }

    //反射Class对象
    public  static void method(){
        try {
            //参数是类的全路径   包名.类名
            Class<?> clazz= Class.forName("cn.tedu.reflection.Student");//<>指泛型，？指不知道什么类型 通过包名反射
            Class<?> clazz2=  Student.class;//通过类名反射
            Class<?> clazz3= new Student().getClass();//匿名对象，通过对象反射

            System.out.println("clazz1="+clazz);
            System.out.println("clazz2="+clazz2);
            System.out.println("clazz3="+clazz3);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //反射构造方法
    public static void method2(){
        //1、反射Class对象
        Class<?> clazz=Student.class;
        //2、反射所有的构造方法们
        Constructor<?>[] cs= clazz.getConstructors();
        //3、遍历数组，获取每个构造方法
        for (Constructor c:cs) {//c代表当前遍历到的构造方法
            //4、获取参数类型们
            Class<?>[] cs2= c.getParameterTypes();
            System.out.println(Arrays.toString(cs2));
        }
    }
    //反射普通方法
    public static void method3() {
        //1、反射Class对象
        Class<?> clazz=Student.class;
        //2、反射所有方法们
        Method[] ms=clazz.getMethods();
        //3、获取每个方法
        for (Method  m:ms) {//m代表反射到的方法
            //获取方法名
            System.out.println(m.getName());
            //4、获取参数类型
            Class<?>[] cs=m.getParameterTypes();
            System.out.println(Arrays.toString(cs));
        }
    }
    //反射成员变量
    public static void method4() {
        //1、反射Class对象
        Class<?> clazz= Student.class;
        //2、反射获取所有成员变量们--只能获取到public的
        Field[] fs= clazz.getFields();
        //3、遍历数组,获取每个成员变量
        for (Field f:fs) {//f代表 得到的变量
            System.out.println(f.getName());
            //获取变量的类型
            System.out.println(f.getType().getName());
        }
    }
    //反射创建对象
    public static void method5() {
        //1、反射Class对象
        Class<?> clazz=Student.class;
        //2、反射创建对象
        try {
            Object obj= clazz.newInstance();//主动触发无参构造方法
            System.out.println("obj="+obj);

            //3、触发含参构造创建对象--先指定要触发的是哪个重载形式的构造方法---参数是形参的数据类型对应的class对象
            Constructor<?> c= clazz.getConstructor(String.class,int.class);
            Object obj2=c.newInstance("张三",18);//指定创建对象时的实参
            System.out.println("obj2="+obj2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
