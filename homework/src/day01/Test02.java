package day01;
/**
 * ��"��Һ�!"�޸�Ϊ:"��Һ�!���ǳ���Ա!"�������
 * Ȼ��"��Һ�!���ǳ���Ա!"�޸�Ϊ:"��Һ�!��������ĳ���Ա!"�����
 * Ȼ�����޸�Ϊ:"��Һ�!����ţţ�ĳ���Ա!"�����
 * Ȼ�����޸�Ϊ:"����ţţ�ĳ���Ա!"�����
 * @author Admin
 *
 */
public class Test02 {
    public static void main(String[] args) {
        test201 t=new test201();
        System.out.println(t.str);
        test202 t1=new test202();
        System.out.println(t1.str);
        test203 t2=new test203();
        System.out.println(t2.str);
        test204 t3=new test204();
        System.out.println(t3.str);
        test205 t4=new test205();
        System.out.println(t4.str);
    }
}
class test201{
    String str="��Һã�";
}
class test202 extends test201{
    String str="��Һã����ǳ���Ա��";
}
class test203 extends test201{
    String str="��Һã���������ĳ���Ա��";
}
class test204 extends  test201{
    String str="��Һã�����ţţ�ĳ���Ա��";
}
class test205 extends  test201{
    String str="����ţţ�ĳ���Ա��";
}