package cn.tedu.lambda;
//�������������Lambda���ʽ:�Ż��������ڲ���ı�д
//���
//Lambda���ʽ��һ������������������ѧ�е�
//�﷨�� �������б� ->{��������}
public class Test6_Lambda {
    public static void main(String[] args) {
        //2��������������+�����ڲ��࣬ʹ�ýӿڵĹ���
        demo d= new demo(){
            @Override
            public void save(){
                System.out.println("save()...");
            }
        };
        d.save();
        //3��Lambda���ʽ
//        Demo d2=(�����б�) ->{������}
        demo d2=() ->{ System.out.println("save()...Lambda"); };//û�в���
        d2.save();
        demo2 dd=(int x,int y ) ->{ System.out.println(x+y); };//�в���
        dd.add(1,2);//��ʵ��1��2���ݸ����β�x��y����ӡ��͵Ľ��

        demo3 ddd=(int m,int n) ->{return m+n;};//Lambda���ʽ�в������з���ֵ��ͨ��return��ֵ����
        System.out.println(ddd.add(5,10));//��ʵ��5��10���ݸ����β�m��n����Ͳ����ؽ��
    }
}

//1��׼���ӿ�:ֻ����һ�����󷽷�
interface  demo{
    void save();

}
interface  demo2{
    void add(int a,int b);
}
interface  demo3{
    int add(int a,int b);
}