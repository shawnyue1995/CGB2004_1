package maopao;

import java.util.Scanner;
//
/*  i <  4                  j <4-i
 * 0							4	ֵ
 * 1						    3  ֵ
 * 2						    2
 * 3						    1
 * i+j=4
 * 6--5
 * 7--6
 *
 */
public class MaoPao {
    public static void main(String[] args) {
        int[] array=new int[5];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("第"+(i+1)+"位学员的成绩是");
            array[i]=input.nextInt();
        }
        System.out.println("**********冒泡前*********");
        for (int i : array) {
            System.out.println(i);
        }
        for (int i = 0; i < array.length-1; i++) {//控制执行几轮
            for (int j = 0; j < array.length-1-i; j++) {//控制数组下标
                if (array[j]>array[j+1]) {
                    //交换
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("**********冒泡后***********");
        for (int i : array) {
            System.out.println(i);
        }
    }
}
