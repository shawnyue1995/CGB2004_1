package cn.tedu.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

//������������� ����
public class Test2_Reflect {
    public static void main(String[] args) {
        method();//����Class����
        method2();//���乹�췽��
        method3();//������ͨ����
        method4();//�����Ա����
        method5();//��������
    }


    public static void method() {
        Class<?> clazz = Reflect.class;
        System.out.println("clazz1=" + clazz);
    }

    public static void method2() {
        Class<?> clazz = Reflect.class;
        Constructor<?>[] cs = clazz.getConstructors();
        for (Constructor c : cs) {
            Class<?>[] cs2 = c.getParameterTypes();
            System.out.println(Arrays.toString(cs2));
        }
    }

    public static void method3() {
        Class<?> clazz = Reflect.class;
        Method[] ms = clazz.getMethods();
        for (Method m : ms) {
            System.out.println(m.getName());
            Class<?>[] cs = m.getParameterTypes();
            System.out.println(Arrays.toString(cs));
        }
    }

    public static void method4() {
        Class<?> clazz = Reflect.class;
        Field[] fd = clazz.getFields();
        for (Field f : fd) {
            System.out.println(f.getName());
            System.out.println(f.getType().getName());
        }
    }

    public static void method5() {
        Class<?> clazz = Reflect.class;
        try {
            Object obj = clazz.newInstance();
            System.out.println("obj1=" + obj);

            Constructor<?> c = clazz.getConstructor(String.class, int.class);
            Object obj2 = c.newInstance("����", 18);
            System.out.println("obj2=" + obj2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}