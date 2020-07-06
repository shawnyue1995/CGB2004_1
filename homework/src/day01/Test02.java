package day01;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 * @author Admin
 *
 */
public class Test02 {
    public static void main(String[] args) {
        test201 t=new test201();
        System.out.println(t.str);
        test202 t1=new test202();
        System.out.println(t1.str);
        test203 t2=new test203();
        System.out.println(t2.str);
        test204 t3=new test204();
        System.out.println(t3.str);
        test205 t4=new test205();
        System.out.println(t4.str);
    }
}
class test201{
    String str="大家好！";
}
class test202 extends test201{
    String str="大家好！我是程序员！";
}
class test203 extends test201{
    String str="大家好！我是优秀的程序员！";
}
class test204 extends  test201{
    String str="大家好！我是牛牛的程序员！";
}
class test205 extends  test201{
    String str="我是牛牛的程序员！";
}