package cn.tedu.count;

import java.util.HashMap;
import java.util.Scanner;

public class Test1_Count {
    public static void main(String[] args) {
        //接收用户输入的字符串
        System.out.println("请输入字符串：");
        String s=new Scanner(System.in).nextLine();
        //创建map存储数据
        HashMap<Character,Integer> map=new HashMap<>();
        //获取每个字符
        for (int i=0; i<s.length();i++){
            //根据下标获取对应的字符
            char key=s.charAt(i);
            //根据字符查个数
            Integer value=map.get(key);
            //如果取出来是null，就存1，引用类型默认值为null
            if (value==null){
                map.put(key,1);
            }else{
                //如果取出来有值，计数加1
                map.put(key,value+1);
            }
        }
        System.out.println(map);

    }
}
