package cn.tedu.hashmap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

//这个类用来测试HashMap
public class HashMap {
    public static void main(String[] args) {
        //1、创建HashMap对象---底层会自动开辟初始空间是16个对象位置，并且分配上限率(加载因子)0.75。会自动扩容
        //		Constructs an empty <tt>HashMap</tt> with the default initial capacity
        //	    (16) and the default load factor (0.75).
        java.util.HashMap map= new java.util.HashMap();
        map.put(9527,"唐伯虎");
        map.put(9528,"秋香");
        map.put(9529,"春香");
        map.put(9530,"夏香");
        map.put(9531,"冬香");
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("9527"));
        System.out.println(map.containsValue("唐伯虎"));
        System.out.println(map.equals("jack"));
        System.out.println(map.get(9528));
        System.out.println(map.hashCode());
        //System.out.println(map.remove(9531));
        Collection<String> values= (Collection<String>) map.values();
        System.out.println(values);

        Set<Integer> set=map.keySet();
        for (Integer key:set) {
            String value= (String) map.get(key);
            System.out.println(key+value);
        }
        Set<Map.Entry<Integer,String>> set1=map.entrySet();
        for (Map.Entry<Integer,String > entry2:set1) {
            Integer key=entry2.getKey();
            String value=entry2.getValue();
            System.out.println(key+value);
        }
    }
}
