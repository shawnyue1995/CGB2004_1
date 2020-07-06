package cn.tedu.variable;

import java.util.Arrays;

//这个类用来测试jdk新特性---可变参数：反射中用到了class工具类有体现
public class Test5_Variable {
    public static void main(String[] args) {
        add(1,2);
        add(1,2,3);
        add(1,2,3,4,5);

    }
    //是方法名相同，但是参数列表不同---叫方法重载---出现的目的是提高程序的灵活性
    //...就是可变参数的体现，体现了参数个数的  省略不管
    //a是数组的实现方式
    public static void add(int...a) {//可变参数必须是参数列表的最后一个
        System.out.println(Arrays.toString(a));
    }

}
