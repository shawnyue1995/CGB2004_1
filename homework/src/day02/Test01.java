package day02;

import java.util.Scanner;

/**
 * Ҫ���û�����һ���ַ�����Ȼ�������ַ�����һ����������ת��Ϊ�������������10��Ľ��
 * ����С������ת��Ϊһ��С�����������5��Ľ�������������������"��������"
 * ��Ҫʹ��������ʽ�����жϡ�
 * @author Admin
 *
 */
public class Test01 {
    public static void main(String[] args) {
        boolean flag=false;
        while(flag==false) {
            Scanner input = new Scanner(System.in);
            String s = input.nextLine();
            for (int i = 0; i <s.length(); i++) {
                if (s.charAt(i)=='.'){//�ж��Ƿ���С����
                    Double d=Double.valueOf(s);
                    System.out.println(d*5);
                    flag=true;
                }else if ((int)s.charAt(i)>47&&(int)s.charAt(i)<58){
                    int in=Integer.valueOf(s);
                    System.out.println(in);
                    flag=true;
                }else{
                    System.out.println("�������֣�");
                }
            }
        }
    }
}
