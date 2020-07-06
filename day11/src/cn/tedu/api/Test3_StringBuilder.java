package cn.tedu.api;
//这个类用来测试StringBuilder
public class Test3_StringBuilder {
    public static void main(String[] args) {
        method();//用+拼接，慢
        method2();// 用工具拼接，快！！
    }
    // 使用+拼接字符串
    public static void method() {
        //1、创建字符串
        String str="abcdefghijklmnopqrstuvwxyz";
        String res="";// 定义变量，记录拼接结果
        long start=System.currentTimeMillis();// 计时开始ms
        for (int i = 0; i < 10000; i++) {
            res=res+str; // 通过+拼接字符串
        }
        long end=System.currentTimeMillis();// 计时结束ms
        System.out.println(end-start);//3046ms
    }
    //用工具拼接，快！！
    public static void method2() {
        String str="abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb=new StringBuilder();
        long start=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(str);// 通过工具类拼接字符串
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);//1ms
    }
}