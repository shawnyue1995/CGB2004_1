package cn.tedu.arraylist;
//这个类用来测试 ArrayList
public class ArrayList {
    public static void main(String[] args) {
        //创建ArrayList对象
        java.util.ArrayList<String> al=new java.util.ArrayList<>();
        //调用方法
        al.add("aaa");
        al.add("bbb");
        al.add("ccc");
        al.add("ddd");
        al.add("ddd");
        al.add("ddd");
        al.add("ddd");
        //常用方法
        System.out.println(al.contains("aaa"));
        System.out.println(al.hashCode());
        System.out.println(al.size());
        System.out.println(al.subList(1,2));
        System.out.println(al.set(2,"abcdefg"));
        System.out.println(al.equals("bbb"));
        System.out.println(al.get(2));
        System.out.println(al.indexOf("ddd"));
        System.out.println(al.lastIndexOf("ddd"));
        System.out.println(al.isEmpty());
        //特有方法
        System.out.println(al.remove(2));//按照下标删
        //底层会自动完成自动装箱的过程，把基本类型的值变成包装类型，存入集合中
        System.out.println(al.remove(String.valueOf("ccc")));//按照元素删
        System.out.println(al);


    }
}
