package cn.tedu.set;

import java.util.Iterator;
//这个类用来测试HashSet的用法
public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<Integer> hs= new java.util.HashSet<Integer>();
        java.util.HashSet<Integer> hs2= new java.util.HashSet<Integer>();
        hs.add(123 );
        hs.add(456);
        hs.add(789);
        hs2.add(111);
        hs2.add(222);
        hs2.add(333);
        System.out.println(hs.contains(123));
        System.out.println(hs.isEmpty());
        System.out.println(hs.remove(789));
        System.out.println(hs.addAll(hs2));
        System.out.println(hs.size());
        Iterator<Integer>   it=hs.iterator();
        while (it.hasNext()){
            int value=it.next();
            System.out.println(value);
        }
        for (int in:hs) {
            System.out.println(in);
        }
    }
}
