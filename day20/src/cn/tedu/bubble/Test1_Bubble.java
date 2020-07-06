package cn.tedu.bubble;

import java.util.Scanner;
/*     n个数比n-1轮            要比n-1-i次
 i     length-1          j    length-1-i
 0 第1轮               比4次
 1 第2轮               比3次
 2 第3轮               比2次
 3 第4轮               比1次
* */
public class Test1_Bubble {
    public static void main(String[] args) {
        int array[]=new int[5];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i <array.length ; i++) {
            System.out.println("第"+(i+1)+"位学员成绩是：");
            array[i]=input.nextInt();
        }
        System.out.println("========冒泡前=========");
        for (int i:array) {
            System.out.println(i);
        }
        for (int i = 0; i <array.length-1 ; i++) {//控制要比几轮
            for (int j = 0; j <array.length-1-i ; j++) {//控制一轮要比几次
                if (array[j]>array[j+1]){
                    int t=array[j+1];
                    array[j+1]=array[j];
                    array[j]=t;
                }
            }
        }
        System.out.println("========冒泡后==========");
        for (int i :array) {
            System.out.println(i);
        }

    }
}
