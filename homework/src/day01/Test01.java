package day01;
/**
 * 1:����ַ���"HelloWorld"���ַ�������
 * 2:���"HelloWorld"��"o"��λ��
 * 3:���"HelloWorld"�д��±�5����ʼ��һ�γ���"o"��λ��
 * 4:��ȡ"HelloWorld"�е�"Hello"�����
 * 5:��ȡ"HelloWorld"�е�"World"�����
 * 6:���ַ���"  Hello   "�����ߵĿհ�ȥ�������
 * 7:���"HelloWorld"�е�6���ַ�"W"
 * 8:���"HelloWorld"�Ƿ�����"h"��ͷ��"ld"��β�ġ�
 * 9:��"HelloWorld"�ֱ�ת��Ϊȫ��д��ȫСд�������
 * @author Admin
 *
 */
public class Test01 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        test1(str);
        //�������е���test2,test3...�ȷ�����
    }
    /**
     * �Ե�ǰ����Ϊ�������������дtest2,test3...�ȷ�����
     * ÿ��������ʵ���������е�һ������
     * ��ǰ����ʵ��:1����ַ���"HelloWorld"���ַ�������
     *
     * test2ʵ��:2:���"HelloWorld"��"o"��λ��
     * �Դ����ơ�
     * @param str
     */
    public static void test1(String str){

        System.out.println("Hello World!");
        System.out.println(str.length());
        System.out.print(str.indexOf("o")+"&");
        System.out.println(str.lastIndexOf("o"));
        System.out.println(str.indexOf("o"));
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(5,10));
        String str2="   HelloWorld   ";
        System.out.println(str2.trim());
        System.out.println(str.charAt(5));
        System.out.println(str.startsWith("h"));
        System.out.println(str.endsWith("ld"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}