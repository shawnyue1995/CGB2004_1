package cn.tedu.annotation;

import java.lang.annotation.*;

//这个类用来测试自定义注解
public class Annotation {
    public static void main(String[] args) {

    }
}
//1、自定义注解interface 注解名
//2、@Target()指定注解可以出现的位置
//3、@Retention()指定注解的生命周期
@Target({ElementType.TYPE,ElementType.METHOD, ElementType.FIELD})//在类上/方法上/属性上
@Retention(RetentionPolicy.SOURCE)//源码中生效
@interface Test{
    //    5、给注解加功能--属性
    String name()default "jack";//8、给属性值赋默认值
    String value();//特殊属性value,特殊在使用时可以直接赋值
//    @Test只能用在类上，用在其他位置上，会报错
    //4、使用注解 ：@注解名
    //@Test(name="HelloTest")//    6、使用属性时，给name赋值
    @Test("123")
//@Test()//7、虽然有了name属性，但是我还想要便捷的使用
    class HelloTest{
        String name;
        public static  void test(){
            System.out.println("test");
        }
    }
}
