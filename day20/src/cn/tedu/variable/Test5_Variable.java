package cn.tedu.variable;

import java.util.Arrays;

//�������������jdk������---�ɱ�������������õ���class������������
public class Test5_Variable {
    public static void main(String[] args) {
        add(1,2);
        add(1,2,3);
        add(1,2,3,4,5);

    }
    //�Ƿ�������ͬ�����ǲ����б�ͬ---�з�������---���ֵ�Ŀ������߳���������
    //...���ǿɱ���������֣������˲���������  ʡ�Բ���
    //a�������ʵ�ַ�ʽ
    public static void add(int...a) {//�ɱ���������ǲ����б�����һ��
        System.out.println(Arrays.toString(a));
    }

}
