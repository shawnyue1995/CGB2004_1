package cn.tedu.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test3_Reflect {
    public static void main(String[] args) {
        method();//������ȡ˽�з���
        method2();//������ȡ˽�еĳ�Ա����
        method3();
    }

    public static void method() {
        //1����ȡClass����
        Class<?> clazz=Reflect.class;
        //2����������//��һ�������Ƿ��������ڶ������������������Ҫ�����͵�class����
        try {
            Method m=clazz.getDeclaredMethod("show2",String.class,int.class);
         //3���÷���ִ������
        //��һ��������Ҫִ���Ǹ�����ķ���
        //�ڶ���������Ҫ����������ʲôʵ��
            Object obj=clazz.newInstance();
            //4�����÷���Ȩ��--˽�пɼ�
            m.setAccessible(true);
            m.invoke(obj,"����",20);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void method2() {
        //1����ȡClass����
        Class<?> clazz=Reflect.class;
        //2����������
        try {
            Field f=clazz.getDeclaredField("age");
            System.out.println(f.getType().getName());

            //3������˽�пɼ�
            f.setAccessible(true);

            //4�����û�ȡ����ֵ
            Object obj=clazz.newInstance();
            f.set(obj,10000);//���ñ���ֵ
            System.out.println(f.get(obj));//��ȡ����ֵ
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
