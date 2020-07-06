package cn.tedu.lambda;
//这个类用来测试Lambda表达式:优化了匿名内部类的编写
//概念：
//Lambda表达式是一个匿名函数，基于数学中的
//语法： （参数列表） ->{语句或语句块}
public class Test6_Lambda {
    public static void main(String[] args) {
        //2、利用匿名对象+匿名内部类，使用接口的功能
        demo d= new demo(){
            @Override
            public void save(){
                System.out.println("save()...");
            }
        };
        d.save();
        //3、Lambda表达式
//        Demo d2=(参数列表) ->{方法体}
        demo d2=() ->{ System.out.println("save()...Lambda"); };//没有参数
        d2.save();
        demo2 dd=(int x,int y ) ->{ System.out.println(x+y); };//有参数
        dd.add(1,2);//把实参1和2传递给了形参x和y并打印求和的结果

        demo3 ddd=(int m,int n) ->{return m+n;};//Lambda表达式有参数，有返回值，通过return把值返回
        System.out.println(ddd.add(5,10));//把实参5和10传递给了形参m和n，求和并返回结果
    }
}

//1、准备接口:只能有一个抽象方法
interface  demo{
    void save();

}
interface  demo2{
    void add(int a,int b);
}
interface  demo3{
    int add(int a,int b);
}