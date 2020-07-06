package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Collection {
    public static void main(String[] args) {
        java.util.Collection<String> c=new ArrayList<>();

        ((ArrayList) c).add("aaa");
        ((ArrayList) c).add("bbb");
        ((ArrayList) c).add("ccc");
        ((ArrayList) c).add("ddd");
        System.out.println(c);
        System.out.println(((ArrayList) c).contains("aaa"));
        System.out.println(c.equals("bbb"));
        System.out.println(c.hashCode());
        System.out.println(((ArrayList) c).isEmpty());
        Object[] obs=((ArrayList) c).toArray();
        System.out.println(Arrays.toString(obs));

        java.util.Collection<String> c2=new ArrayList<>();
        c2.add("aaa");
        c2.add("bbb");
        c2.add("ccc");
        System.out.println(((ArrayList<String>) c).addAll(c2));
        System.out.println(c);
        System.out.println(c.containsAll(c2));
        Iterator<String> it=c.iterator();
        while (it.hasNext()) {
            String value=it.next();
            System.out.println(value);
        }
    }
}
