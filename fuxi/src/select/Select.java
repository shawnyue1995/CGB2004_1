package select;

import java.util.Scanner;

public class Select {
    public static void main(String[] args) {
        int[] array=new int[5];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("第"+(i+1)+"个学生的成绩是");
            array[i]=input.nextInt();
        }
        System.out.println("--------排序前--------");
        for (int i : array) {
            System.out.println(i);
        }
        // 总共要经过 N-1 轮比较
        for (int i = 0; i < array.length-1; i++) {
            int min=i;
            for (int j = i+1; j < array.length; j++) {// 选最小的记录
                if (array[j]<array[min]) {
                    // 记录目前能找到的最小值元素的下标
                    min=j;
                }
            }
            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
            if (i!=min){
                int t=array[i];
                array[i]=array[min];
                array[min]=t;
            }
        }

        System.out.println("-----排序后----------");
        for (int i : array) {
            System.out.println(i);
        }
    }
}
