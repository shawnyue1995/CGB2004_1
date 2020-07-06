package charu;

import java.util.Scanner;

//这个类用来测试插入排序
public class ChaRu {
    public static void main(String[] args) {
        int[] array=new int[5];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("第"+(i+1)+"位学生的成绩");
            array[i]=input.nextInt();
        }
        System.out.println("******排序前**********");
        for (int i : array) {
            System.out.println(i);
        }
        for (int i = 1; i < array.length; i++) {
            int temp=array[i];
            for (int j = i; temp<array[j-1]; j--) {
                array[j]=array[j-1];
                array[j-1]=temp;
            }
        }
        System.out.println("*******排序后***********");
        for (int i : array) {
            System.out.println(i);
        }
    }
}
