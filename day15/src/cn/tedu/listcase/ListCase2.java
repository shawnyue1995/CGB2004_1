package cn.tedu.listcase;
/*
 * 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
	分析：
		A.创建键盘录入对象
		B.创建集合对象
		C.如果接到到录入的数据为0,退出
		D.把集合转换为数组
		E.取数组中最大索引的那个数，就是最大值
		D.把最大值输出
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListCase2 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //创建集合
        ArrayList<Integer> al2 = new ArrayList<>();
        while (true) {
            System.out.println("请输入数据：");
            int in = sc.nextInt();
            if (in == 0) {
                break;//如果接到到录入的数据为0,退出
            }
            al2.add(in);
        }
        //把集合转换成数组
        Object[] arr = al2.toArray();
        //数组排序
        Arrays.sort(arr);//升序
        for (Object i : arr) {
            System.out.println(i);
        }
        System.out.println("输入的输中最大值是：" + arr[arr.length - 1]);
    }
}