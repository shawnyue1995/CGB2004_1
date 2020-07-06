package cn.tedu.io;

import java.util.ArrayList;
import java.util.List;

public class Test3_Generic {
    public static void main(String[] args) {
        //3、不适用泛型约束的集合，可以添加任意类型的元素
        //List lis=new ArrayList();

        //5、泛型约束的元素类型,<what>--what是指元素类型，而且是引用类型，不能写基本类型
        List<Integer> list=new ArrayList();//4、使用了泛型，约束了集合中元素类型必须是String

        //1、限制集合中的元素中的类型，--泛型的作用1、可以检查数据的类型，如果类型对才可以向集合中添加
        //2、泛型的作用2、可以把报错时机提前，如果有错编译都通不过，必须改
        //3、问题是，向集合中添加任意类型的元素，太自由
        list.add(123);
        //list.add(5.5);
        //list.add("jack");
        //list.add("rose");
        System.out.println(list);
    }
}
