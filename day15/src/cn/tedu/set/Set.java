package cn.tedu.set;
import java.util.HashSet;
import java.util.Iterator;

//这个类用来测试   set接口：set中的元素不能重复+元素是没有下标的+元素无序
public class Set<I extends Number> {
    public static void main(String[] args) {
        //1、创建对象
        java.util.Set<Integer> s= new HashSet<>();
        java.util.Set<Integer> s2= new HashSet<>();
        //2、常用方法
        s.add(111);
        s.add(222);
        s.add(333);
        s.add(444);
        s2.add(444);
        System.out.println(s.contains(111));
        System.out.println(s.isEmpty());
        System.out.println(s.remove(222));
        System.out.println(s.size());
        System.out.println(s.addAll(s2));
        //set中不能存在重复元素，常用来去重
        System.out.println(s);
        //3、迭代
        Iterator<Integer> it= s.iterator();
        while (it.hasNext()){//判断是否有下一个元素
            Integer value=it.next();//获取元素并把指针后移
            System.out.println(value);
        }
        //foreach  for(获得的数据类型   遍历名  :   数组|Collection集合 ){   }
        for (Integer in:s) {
            System.out.println(in);
        }
    }
}
