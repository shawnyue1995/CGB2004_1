package cn.tedu.inner;
//��������������ڲ��౻static����
public class Test5_Inner {
    public static void main(String[] args) {
        /*Outer2.Inner2 in2=new Outer2().new Inner2();//����ԭ����Inner2�Ǿ�̬���ڲ���
        in2.shouin();
        System.out.println(in2.age);*/
        Outer2.Inner2 in2=new Outer2.Inner2();//Outer2.Inner2ͨ������.�������еľ�̬��Դ
        Outer2.Inner2.shouin();
        System.out.println(in2.age);
    }
}
class Outer2{
    String name="����";
    public void showout(){
        System.out.println("showout()...");
    }
    //1���ڲ��౻static����--������ļ��ض����أ�������ڴ���Դ�˷ѣ��������ã�
    static class Inner2{
        int age=18;
        public static void shouin(){
            System.out.println("shouin()...");
        }
    }
}