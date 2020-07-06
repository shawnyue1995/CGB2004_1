package cn.tedu.number;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test3_SDFormat {
    public static void main(String[] args) {
        //计算存活天数
        //1、接收用户输入的出生日期
        System.out.println("请输入出生日期：");
        String birth=new Scanner(System.in).nextLine();
        //2、把String类型的日期转成Date类型,需要用到工具SimpleDateFormat
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//输入日期的格式
        Date d=null;//给date一个默认值
        try {
            d=sdf.parse(birth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //3、获取出生时的毫秒值
        long birthday=d.getTime();
        //4、获取当前的毫秒值
        long now=System.currentTimeMillis();
        //5、输出时间差，换算成天
        System.out.println((now-birthday)/1000/60/60/24);
    }
}
