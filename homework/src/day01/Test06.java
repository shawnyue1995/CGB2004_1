package day01;

import java.util.Scanner;

/**
 * �û��ӿ���̨����һ���ַ����������ٰ���һ����/�������û�У�����������ʾ��
 * ����У���ȡ���һ����/������ַ�����
 * @author Admin
 */
public class Test06 {
    public static void main(String[] args) {
        boolean flag=false;
        while(flag==false){
            System.out.println("������һ���ַ���");
            String input=new Scanner(System.in).nextLine();
            boolean b=input.contains("/");
            if (b==true){
                System.out.println("������ȷ��");
                flag=true;
            }else{
                System.out.println("���ٰ���һ��/");
            }
        }

    }
}
