package cn.tedu.list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

//这个类用来测试 List接口的使用：元素可重复  +  元素都有序  + 元素有索引
public class List {
    public static void main(String[] args) {
        //1、创建List对象
        java.util.List<String> list=new ArrayList<>();
        java.util.List<String> list2=new ArrayList<>();

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
        //1、继承来的方法 Iterator<E> iterator() 返回按适当顺序在列表的元素上进行迭代的迭代器。
        Iterator<String> it3 = list.iterator() ;
        while(it3.hasNext() ) {//判断有下一个元素就返回true
            String value = it3.next() ;//用来获取元素并且把指针后移
            System.out.println(value);
        }
        //2、List接口特有的ListIterator<E> listIterator()   返回此列表元素的列表迭代器（按适当顺序）。
        //listIterator()  iterator() 对比：iterator() 来自父接口。listIterator()是子接口的特有功能。
        //区别是：子接口除了可以使用父接口的所有功能的同时，又做了功能扩展。不仅能向后顺序遍历而且可以向前逆向遍历。
        ListIterator<String> it2=list.listIterator();
        while (it2.hasNext()) {//向后判断，有没有元素
            String value2=it2.next();//获取后面的元素
        }
        //3、下标遍历
        for (int i = 0; i < list.size(); i++) {//下标最大值时集合长度
            System.out.println(list.get(i));//根据下标获取元素
        }
        //4、增强for  foreach
        //for(遍历到的数据类型   变量名    :   数组 | Collection集合) { }
        for (String s :list  ){
            System.out.println(s);
        }
    }
}
