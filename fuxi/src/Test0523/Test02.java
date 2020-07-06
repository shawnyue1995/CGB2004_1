package Test0523;

public class Test02 {
    public static void main(String[] args) {
        Test t=new Test();
        Test2 t2=new Test2();
        Test3 t3=new Test3();
        Test4 t4=new Test4();
        Test5 t5=new Test5();
        t.test11();
        t2.test11();
        t3.test11();
        t4.test11();
        t5.test11();
    }
}
class Test{
    public void test11() {
        String str="大家好！";
        System.out.println(str);
    }
}
class Test2 extends  Test{
    @Override
    public void test11(){
        String str="大家好！我是程序员";
        System.out.println(str);
    }
}
class Test3 extends Test2{
    @Override
    public void test11(){
        String str="大家好！我是优秀的程序员";
        System.out.println(str);
    }
}
class Test4 extends Test3{
    @Override
    public void test11(){
        String str="大家好！我是牛牛的程序员";
        System.out.println(str);
    }
}
class Test5 extends  Test4{
    @Override
    public void test11(){
        String str="我是牛牛的程序员!";
        System.out.println(str);
    }
}