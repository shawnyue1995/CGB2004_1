package cn.tedu.number;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2_Date {
    public static void main(String[] args) {
        //1、创建对象
        Date date=new Date();
        //2、常用方法
        System.out.println(date.getDate());//获取一个月的第几天
        System.out.println(date.getYear());//获取从1900年到现在多少年了
        System.out.println(date.getMonth()+1);//获取一年的第几个月，底层源码显示，会获取当前月份-1
        System.out.println(date.getDay());//获取一周的第几天
        System.out.println(date.getHours());//获取现在是几点了
        System.out.println(date.getMinutes());//获取现在是多少分钟
        System.out.println(date.getSeconds());//获取现在是多少秒
        System.out.println(date.getTime());//获取1970年1月1日0点到现在的毫秒值
        System.out.println(date.toLocaleString());//展示年月日时分秒
    }
}
