package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test3_Collection {
    public static void main(String[] args) {
        //����List����
        List<Integer> list=new ArrayList<>();
        /*list.add(1);
          list.add(2);
          list.add(3);
        /*list.add(4);*/
            //2�����Ԫ��
        //2��ʹ���˹�����󣬿���һ������Ӷ��Ԫ��
        Collections.addAll(list,1,2,3,4,5);
        System.out.println(list);
        //3����ӡ���ֵ
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        //4����ָ�������е�Ԫ�ط�ת
        Collections.reverse(list);
        System.out.println(list);
        //5����ָ���������򣬴�С����
        Collections.sort(list);
        System.out.println(list);
        //6����ָ�����ϵ�ָ���±��Ԫ�ؽ���
        Collections.swap(list, 2,4);
        System.out.println(list);
    }
}
