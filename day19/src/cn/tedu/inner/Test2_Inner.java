package cn.tedu.inner;
//������������������ڲ���
public class Test2_Inner {
    public static void main(String[] args) {
        //ʹ�ýӿ���Ĺ���,new Inter()�൱�ڴ�����һ���ӿڵ�ʵ�������ֻ������������
//        new Inter(){//�����ڲ���---�ӿڲ��ܱ�ʵ������������������ڲ������
//            @Override
//            public void save() {
//                System.out.println("save()...");
//            }
//
//            @Override
//            public void get() {
//                System.out.println("get()...");
//            }
//
//        }.get();//����ָ������---�����ڲ���һ��ֻ��һ����
//        new Inter2(){//�൱�ڴ����˳�����Ķ���
//
//            @Override
//            public void save() {
//
//            }
//        }.save();//����ָ������
        Inter in=new Inter(){//�������ڲ���������֣��Ϳ���ִ�ж��������
            @Override
            public void save() {
                System.out.println("save()...");
            }

            @Override
            public void get() {
                System.out.println("get()...");
            }

        };//������������
        in.get();
        in.save();
        new Inter2(){//�൱�ڴ����˳�����Ķ���

            @Override
            public void save() {

            }
        }.save();//����ָ������
    }
}
interface Inter{
    void save();
    void get();
}
//����������
//�������������������
abstract  class Inter2{
     public abstract  void save();
     public   void get(){
         System.out.println("get2()...");
     }
}