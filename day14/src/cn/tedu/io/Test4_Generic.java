package cn.tedu.io;

//这个类用来测试泛型的通用性
public class Test4_Generic {
    public static void main(String[] args) {
        Integer[] a= {1,2,3,4,5};
        Double[] b= {1.1,2.2,3.3,4.4,5.5};
        String[] c= {"张三","李四","王五"};
        print(a);
        print(b);
        print(c);
    }
    //2、以前参数列表，写死了，必须是具体类型，泛型可以写出通用代码，只要是E泛类型就行
    public static<E> void print(E[] b) {
        for (E d : b) {
            System.out.println(d);
        }
    }
    public static void print(Integer[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        //foreach语法：提高普通for循环执行效率，语法简介
        //for(获取的数据额类型  变量名：想要循环的数组){循环体}
        for (Integer integer : a) {
            System.out.println(integer);//integer表示当前获取的数据
        }
    }
}