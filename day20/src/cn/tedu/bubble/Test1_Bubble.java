package cn.tedu.bubble;

import java.util.Scanner;
/*     n������n-1��            Ҫ��n-1-i��
 i     length-1          j    length-1-i
 0 ��1��               ��4��
 1 ��2��               ��3��
 2 ��3��               ��2��
 3 ��4��               ��1��
* */
public class Test1_Bubble {
    public static void main(String[] args) {
        int array[]=new int[5];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i <array.length ; i++) {
            System.out.println("��"+(i+1)+"λѧԱ�ɼ��ǣ�");
            array[i]=input.nextInt();
        }
        System.out.println("========ð��ǰ=========");
        for (int i:array) {
            System.out.println(i);
        }
        for (int i = 0; i <array.length-1 ; i++) {//����Ҫ�ȼ���
            for (int j = 0; j <array.length-1-i ; j++) {//����һ��Ҫ�ȼ���
                if (array[j]>array[j+1]){
                    int t=array[j+1];
                    array[j+1]=array[j];
                    array[j]=t;
                }
            }
        }
        System.out.println("========ð�ݺ�==========");
        for (int i :array) {
            System.out.println(i);
        }

    }
}
