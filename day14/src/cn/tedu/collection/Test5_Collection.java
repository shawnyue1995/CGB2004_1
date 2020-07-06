package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

//这个类用来测试collection接口的使用
public class Test5_Collection {
    public static void main(String[] args) {
        //1、创建Collection对象
        Collection<String>  str=new ArrayList<>();

//        2、常用方法
        str.add("aaa");
        str.add("bbb");
        str.add("ccc");
        str.add("ddd");
        System.out.println(str);
        //System.out.println(str.remove("ddd"));//移除指定元素
        System.out.println(str.contains("aaa"));//判断是否包含
        System.out.println(str.equals("aaa"));//判断是否相等
        System.out.println(str.hashCode());//获取哈希吗值
        System.out.println(str.isEmpty());//判断是否为空
        System.out.println(str.remove("aaa"));//删除指定元素
        System.out.println(str.size());//获取集合长度
        Object[] obj=str.toArray();//把集合转成数组
        System.out.println(Arrays.toString(obj));
//3、集合间操作
        Collection<String> c=new ArrayList<>();
        c.add("xxx");
        c.add("yyy");
        c.add("zzz");
        c.add("wwww");
        System.out.println(str.addAll(c));//添加另一个集合
        System.out.println(str.containsAll(c));//判断是否包含另一个集合
        System.out.println(str.removeAll(c));//移除另一个集合---获取差集（两个元素中不同的元素）
        System.out.println(str.retainAll(c));//移除另一个集合---获取交集（两个元素中相同的元素）
//集合元素的迭代
        Iterator<String> it=str.iterator();
        while(it.hasNext()){
            //hasNext()用来判断集合中是否还有下一个元素
            String value=it.next();//next()获取迭代的元素
            System.out.println(value);
        }
    }
}
