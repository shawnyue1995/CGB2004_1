package cn.tedu.number;
//这个类用来测试 包装类型
public class Test1_Integer {
    public static void main(String[] args) {
        //1、创建Integer对象---目的就是把基本类型包装成包装类型--自动装箱
        Integer in=new Integer(5);//高效，底层显示：如果数据在-128-127内，会把数据放在缓存里，如果是相同数据就不再存了
        Integer in2=Integer.valueOf(5);//测试，静态方法valueOf，相同数据不再开辟空间存了吗--是的，为了节省内存和时间
        Integer in3=Integer.valueOf(5);//true
        System.out.println(in2==in3);
        //2、常用方法
        int value=in.intValue();//把包装类型的值变成基本类型--自动拆箱
        System.out.println(value);
        int intvalue=Integer.parseInt("123");//把字符串类型的数字转成基本类型
        System.out.println(intvalue);
        //创建Double对象--自动装箱
        Double d=new Double(9.9);
        Double d2=Double.valueOf(9.9);
        Double d3=Double.valueOf(9.9);//不高效，底层显示和new
        System.out.println(d3==d2);

        double dvalue=d.doubleValue();//自动拆箱
        System.out.println(dvalue);
        double dvalue2=Double.parseDouble("9.999");
        System.out.println(dvalue2);

    }
}
