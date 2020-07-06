package cn.tedu.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//这个类用来测试Map接口：数据无序+key不能重复，如果重复，value会被覆盖
public class Map {
    public static void main(String[] args) {
        //1、创建map对象
        java.util.Map<Integer,String> m=new HashMap();
        m.put(9527,"唐伯虎");
        m.put(9528,"如花");
        m.put(9528,"春花");
        System.out.println(m);
        //2、常用方法
        System.out.println(m.containsKey(9527));//判断是否包含指定的key
        System.out.println(m.containsValue("Tony"));//判断是否包含指定的value
        System.out.println(m.equals("Tony"));//判断是否相等
        System.out.println(m.get(9527));//获取指定的元素
        System.out.println(m.hashCode());//获取哈希吗值
        System.out.println(m.isEmpty());//判断是否为空
        System.out.println(m.size());//获取集合的长度
        //System.out.println(m.remove(9527));//根据key删除记录，并且返回value值
        //m.clear();

        Collection<String> values=m.values();//把map中的value得元素存入Collection中
        System.out.println(values);

        //3、迭代map集合--需要把map转成set
        //Set<K> keySet() --把key存入set集合
        //Set<Integer> set = map.keySet() ;
        Set<Integer> set=m.keySet();//把key放入set中
        for (Integer key: set) {//遍历set得到每个key
            String value=m.get(key);//拿着key去map里找value
            System.out.println(key+":"+value);
        }
        //Set<Map.Entry<K,V>> entrySet() ---把整条记录封装成Entry对象存入set集合
        Set<java.util.Map.Entry<Integer,String>> set2= (Set<java.util.Map.Entry<Integer, String>>) m.entrySet();
        for (java.util.Map.Entry<Integer,String> entry:set2) {//遍历set得到每个Entry
            Integer key=entry.getKey();//获取Entry的key
            String value=entry.getValue();//获取Entry的value
            System.out.println(key+":"+value);
        }


    }

}