package cn.tedu.inner;
//��������������ڲ���
public class Test4_Inner {
    public static void main(String[] args) {
        //1�������ڲ������ʹ���ڲ�����Դ
        //�ⲿ����.�ڲ�����  ���� =�ⲿ�����.�ڲ������
       Outer.Inner in=new Outer().new Inner();
        in.showIn();
        System.out.println(in.age);

           new Outer().showOut();
    }
}
class Outer{//�ⲿ��
    //2�������Ҫ����private���ڲ��࣬���Է����ⲿ���ṩ�Ķ�Ӧ����
    String name="����";
    public void showOut(){
        System.out.println("showOut()...");
        //���ⲿ������ڲ�����Դ---������ֱ�ӵ��ã������ڲ������������
        new Inner().showIn();
    }
    //λ�������﷽����--��Ա�ڲ���
    //1���ڲ�����Ա�private���Σ���������޷�ֱ�Ӵ��������ˣ�
    public class Inner{//�ڲ���
        public void showIn(){
            //�ڲ��������ʹ���ⲿ�����Դ��
//            showOut();
            System.out.println("showIn()...");
        }

        int age=99999;
    }
}
