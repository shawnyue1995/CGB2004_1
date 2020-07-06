package cn.tedu.linkedlist;
//这个类用来测试LinkedList
public class LinkedList {

    public static void main(String[] args) {
        //1、创建LinkedList对象
        java.util.LinkedList<Integer> l= new java.util.LinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);

        //2、特有方法
        l.addFirst(99);//将指定元素插入此列表的开头。
        l.addLast(100);//将指定元素添加到此列表的结尾。
        System.out.println(l.getFirst());//获取第一个元素。
        System.out.println(l.getLast());//获取最后一个元素
        System.out.println(l.removeFirst());//移除并返回此列表的第一个元素。
        System.out.println(l.removeLast());//移除并返回此列表的最后一个元素。
        System.out.println(l);
    }


}
