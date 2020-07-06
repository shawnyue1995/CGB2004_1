package cn.tedu.list;

import java.util.*;
//这个类用来测试 List接口的使用：元素可重复  +  元素都有序  + 元素有索引
public class Test6_List {
    public static void main(String[] args) {
        //1、创建List对象
        List<String> list=new ArrayList<>();
        List<String> list2=new ArrayList<>();

        //2、常用方法
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("ddd");
        list.add("ddd");
        list.add(null);
        //2、从Collection接口中继承来的方法
        System.out.println(list.contains("aaa"));
        System.out.println(list.equals("bbb"));
        System.out.println(list.hashCode());
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        Object[] obs=list.toArray();
        System.out.println(Arrays.toString(obs));
        //System.out.println(list.remove("aaa"));
        list2.add("xxx");
        list2.add("zzz");
        list2.add("YYY");
        System.out.println(list.addAll(list2));
        System.out.println(list.containsAll(list2));
        //System.out.println(list.removeAll(list));
        //System.out.println(list.retainAll(list2));


        //3、自己的特有方法
        list.add(0,"abc");//按照索引添加元素
        System.out.println(list.get(0));//按照索引获取元素
        System.out.println(list.indexOf("ddd"));//获取元素第一次出现的索引值
        System.out.println(list.lastIndexOf("ddd"));//获取元素最后一次出现的索引值
        System.out.println(list.remove(1));//把指定索引的元素删除
        System.out.println(list.set(2, "gggg"));//把指定索引的元素替换掉
        System.out.println(list.subList(2, 4));//按照索引截取元素
        System.out.println(list);
        Iterator<String> it=list.iterator();
        while (it.hasNext()) {
            String value=it.next();
            System.out.println(value);

        }
        ListIterator<String> it2=list.listIterator();
        while (it2.hasNext()) {//向后判断，有没有元素
            String value2String=it2.next();//获取后面的元素
        }
        //小标遍历
        for (int i = 0; i < list.size(); i++) {//下标最大值时集合长度
            System.out.println(list.get(i));//根据下标获取
        }
        for (String s :list  ){
            System.out.println(s);
        }
    }
}
