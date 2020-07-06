package cn.tedu.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test3_Reflect {
    public static void main(String[] args) {
        method();//暴力获取私有方法
        method2();//暴力获取私有的成员变量
        method3();
    }

    public static void method() {
        //1、获取Class对象
        Class<?> clazz=Reflect.class;
        //2、暴力反射//第一个参数是方法名，第二个参数是这个方法需要的类型的class对象
        try {
            Method m=clazz.getDeclaredMethod("show2",String.class,int.class);
         //3、让方法执行起来
        //第一个参数是要执行那个对象的方法
        //第二个参数是要给方法传入什么实参
            Object obj=clazz.newInstance();
            //4、设置访问权限--私有可见
            m.setAccessible(true);
            m.invoke(obj,"张三",20);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void method2() {
        //1、获取Class对象
        Class<?> clazz=Reflect.class;
        //2、暴力反射
        try {
            Field f=clazz.getDeclaredField("age");
            System.out.println(f.getType().getName());

            //3、设置私有可见
            f.setAccessible(true);

            //4、设置获取属性值
            Object obj=clazz.newInstance();
            f.set(obj,10000);//设置变量值
            System.out.println(f.get(obj));//获取变量值
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void method3() {
        Class<?> clazz=Reflect.class;
        Method[] ms=clazz.getDeclaredMethods();

        for (Method m:ms) {
            System.out.println(m.getName());
        }
        Field[] fs= clazz.getDeclaredFields();
        for (Field f:fs) {
            System.out.println(f.getName());
        }
    }
}
