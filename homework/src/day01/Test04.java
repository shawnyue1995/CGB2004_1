package day01;

import java.util.Scanner;

/**
 * Ҫ���û��ӿ���̨����һ��email��ַ��Ȼ���ȡ��email���û���(@֮ǰ������)
 * @author Admin
 *
 */
public class Test04 {
    public static void main(String[] args) {
        boolean flag=false;
        while(flag==false){
            System.out.println("������email��ַ:");
            Scanner input=new Scanner(System.in);
            String s=input.nextLine();
            //(8-11)@(qq,163...).com
            String regex="[0-9]{8,11}@.{2,3}\\.com";
            Boolean matches=s.matches(regex);
            if (matches==true){
                System.out.println("�����ʽ������ȷ��");
                flag=true;
            }else{
                System.out.println("�����ʽ�������");
            }
        }
    }
}
