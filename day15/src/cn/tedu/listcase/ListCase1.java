package cn.tedu.listcase;

import java.util.ArrayList;
import java.util.Random;

/*
 * 获取10个1-20之间的随机数，要求不能重复

   	分析：
   		A.创建产出随机数的对象
   		B.创建一个存储随机的数的集合
   		C.定义一个统计变量 初始值为0
   		D.判断集合中是否有这个随机数
   			是：不往里存
   			否：往里存,统计变量++
   		D.遍历这个集合
 */
public class ListCase1 {
    public static void main(String[] args) {
        //创建产生随机数的对象
        Random r=new Random();
        //创建一个存储随机数的集合
        ArrayList<Integer> al=new ArrayList<>();
        //定义一个变量，初始值为0
        int count=0;
        while(count<10) {//定义集合长度
            int n=r.nextInt();
            if (!al.contains(n)) {//判断是否包含这个随机数
                al.add(n);//往里面存
                count++;
            }
        }
        for (int i:al) {
            System.out.println(i);
        }
    }
}
