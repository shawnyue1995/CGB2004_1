package cn.tedu.number;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test4_Double {
    public static void main(String[] args) {
        method();//暴露问题
        method2();//解决浮点数运算不精确的问题Bigdecimal
    }
    public static void method() {
        System.out.println("输入小数1：");
        double d=new Scanner(System.in).nextDouble();
        System.out.println("输入小数2：");
        double d2=new Scanner(System.in).nextDouble();
        System.out.println(d+d2);//不精确
        System.out.println(d-d2);//不精确
        System.out.println(d*d2);//不精确
        System.out.println(d/d2);//不精确
    }
    public static void method2() {
        // 1、接收用户输入的两个小数
        System.out.println("输入小数1：");
        double d=new Scanner(System.in).nextDouble();
        System.out.println("输入小数2：");
        double d2=new Scanner(System.in).nextDouble();
        //2、创建对象---建议使用String类型的构造方法
        BigDecimal b=new BigDecimal(d+"");
        BigDecimal b2=new BigDecimal(d2+"");
        //3、做运算
        BigDecimal b3;//定义big3保存计算结果
        b3=b.add(b2);//加法
        System.out.println(b3);
        b3=b.subtract(b2);//减法
        System.out.println(b3);
        b3=b.multiply(b2);//乘法
        System.out.println(b3);
        //		b3 = b1.divide(b2) ;//除法java.lang.ArithmeticException: 除不尽
//-------------divide(a,b,c)--a是指要运算的对象名  ---b是指要保留几位小数 ---c是指舍入方式
        b3=b.divide(b2,3,BigDecimal.ROUND_HALF_UP);//除法,四舍五入
        System.out.println(b3);
    }
}
