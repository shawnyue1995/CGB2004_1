package cn.tedu.inner;
//�������������private/static�ڲ���
public class Test1_Inner {
    public static void main(String[] args) {
        //�����ڲ������
/*        Outer.Inner in=new Outer().new Inner();//�ڲ��౻��װ�ˣ��޷�ֱ��new
        in.showIn();*/
//����showOut()����
    new Outer().showOut();
    //6��ʹ��Inner2����Դ---����ֱ��ͨ���ⲿ����.�ڲ���������λ�ڲ���
        Outer.Inner2 in2=new Outer.Inner2();
        in2.showIn2();
        //7�����ʾ�̬�ڲ�����ľ�̬����
        Outer.Inner2.showIn2();
    }
}
class Outer{
    String name;
    public void showOut(){
        //3����ӷ���showIn()
        new Inner().showIn();
        System.out.println("shouOut()...");
    }
    //1���ڳ�Աλ�õ��ڲ���г�Ա�ڲ��ࡣ���Ա�private���Σ�Ҳ���Ա�static����
        class Inner{
        int age;
        private void showIn(){
            System.out.println("showIn()...����");
        }
    }
    //5���ڲ��౻static����
    static class Inner2{
          int count=10;
        static void showIn2(){

            System.out.println("showIn2()...");
        }
    }
}