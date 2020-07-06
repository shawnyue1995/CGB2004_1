package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test3_Collection {
    public static void main(String[] args) {
        //创建List集合
        List<Integer> list=new ArrayList<>();
        /*list.add(1);
          list.add(2);
          list.add(3);
        /*list.add(4);*/
            //2、添加元素
        //2、使用了工具类后，可以一次性添加多个元素
        Collections.addAll(list,1,2,3,4,5);
        System.out.println(list);
        //3、打印最大值
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        //4、把指定集合中的元素反转
        Collections.reverse(list);
        System.out.println(list);
        //5、给指定集合排序，从小到大
        Collections.sort(list);
        System.out.println(list);
        //6、给指定集合的指定下标的元素交换
        Collections.swap(list, 2,4);
        System.out.println(list);
    }
}
