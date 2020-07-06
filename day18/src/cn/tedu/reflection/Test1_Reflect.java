package cn.tedu.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

//������������� �ײ� ����
public class Test1_Reflect {
    public static void main(String[] args) {
        method();//����class����
        method2();//���乹�췽��
        method3();//������ͨ����
        method4();//�����Ա����
        method5();//���䴴������
    }

    //����Class����
    public  static void method(){
        try {
            //���������ȫ·��   ����.����
            Class<?> clazz= Class.forName("cn.tedu.reflection.Student");//<>ָ���ͣ���ָ��֪��ʲô���� ͨ����������
            Class<?> clazz2=  Student.class;//ͨ����������
            Class<?> clazz3= new Student().getClass();//��������ͨ��������

            System.out.println("clazz1="+clazz);
            System.out.println("clazz2="+clazz2);
            System.out.println("clazz3="+clazz3);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //���乹�췽��
    public static void method2(){
        //1������Class����
        Class<?> clazz=Student.class;
        //2���������еĹ��췽����
        Constructor<?>[] cs= clazz.getConstructors();
        //3���������飬��ȡÿ�����췽��
        for (Constructor c:cs) {//c����ǰ�������Ĺ��췽��
            //4����ȡ����������
            Class<?>[] cs2= c.getParameterTypes();
            System.out.println(Arrays.toString(cs2));
        }
    }
    //������ͨ����
    public static void method3() {
        //1������Class����
        Class<?> clazz=Student.class;
        //2���������з�����
        Method[] ms=clazz.getMethods();
        //3����ȡÿ������
        for (Method  m:ms) {//m�����䵽�ķ���
            //��ȡ������
            System.out.println(m.getName());
            //4����ȡ��������
            Class<?>[] cs=m.getParameterTypes();
            System.out.println(Arrays.toString(cs));
        }
    }
    //�����Ա����
    public static void method4() {
        //1������Class����
        Class<?> clazz= Student.class;
        //2�������ȡ���г�Ա������--ֻ�ܻ�ȡ��public��
        Field[] fs= clazz.getFields();
        //3����������,��ȡÿ����Ա����
        for (Field f:fs) {//f���� �õ��ı���
            System.out.println(f.getName());
            //��ȡ����������
            System.out.println(f.getType().getName());
        }
    }
    //���䴴������
    public static void method5() {
        //1������Class����
        Class<?> clazz=Student.class;
        //2�����䴴������
        try {
            Object obj= clazz.newInstance();//���������޲ι��췽��
            System.out.println("obj="+obj);

            //3���������ι��촴������--��ָ��Ҫ���������ĸ�������ʽ�Ĺ��췽��---�������βε��������Ͷ�Ӧ��class����
            Constructor<?> c= clazz.getConstructor(String.class,int.class);
            Object obj2=c.newInstance("����",18);//ָ����������ʱ��ʵ��
            System.out.println("obj2="+obj2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
