package day01;

import java.util.Random;
import java.util.Scanner;

/**
 * �������һ��5λ��Ӣ����ĸ��֤��(��Сд���)
 * Ȼ�󽫸���֤��������û���Ȼ��Ҫ���û��������֤�룬��Сд�����ơ�
 * Ȼ���ж��û��������֤���Ƿ���Ч(�����û������Сд��ֻҪ��ĸ����ȷ����)��
 * @author Admin
 *
 */
public class Test05 {
    public static void main(String[] args) {
        method();
    }
    public static void method() {
        boolean flag=false;
        while(flag==false) {
            //1������һ������Ϊ5�����飬��ΪҪ���ɵ���һ��5λ����֤��
            String[] str = new String[5];
            //����һ��int���͵ı�������������ʼ��
            int str1 = 0;
            //����һ��char���͵ı�������������ʼ��
            char str2 = 0;
            //����һ���ַ������͵ı���
            String str3 = "";

            //2�����������֤��
            for (int i = 0; i < 5; i++) {
                Random r = new Random();//���������
                str1 = r.nextInt(58) + 65;//�������58����������65��ʼ
                str2 = (char) str1;//�����ε�strת����char���͵�

                //ASCII 0-65 A-Z,97-122 a-z
                //������ɵ�������90��97֮��ģ�����ռ��ѭ�����������ɵ���֤����ܲ���5λ�ġ�
                if (str1 >= 65 && str1 <= 90 || str1 >= 97 && str1 <= 122) {
                    str3 = str2 + str3;//���ַ����μ����ַ�����
                } else {
                    i--;//���������һ��
                }
            }
            //3�������֤��
            System.out.println("��֤���ǣ�" + str3.toString());

            //4�����û�������֤��
            System.out.println("��������֤�룺");
            Scanner input = new Scanner(System.in);
            String s = input.nextLine();

            //5���ж���֤��
            boolean b = s.equalsIgnoreCase(str3);//�Ƚ������ַ������������ִ�Сд��ֻ����ĸ�Ծ�����
            if (b == true) {
                System.out.println("��֤����ȷ��");
                flag=true;
            } else {
                System.out.println("��֤�����");
            }
        }

    }
}
