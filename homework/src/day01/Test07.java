package day01;

/**
 * 生成一个 包含所有汉字的字符串,且每生成50个汉字进行换行输出。
 * 提示：java字符类型采用Unicode字符集编码，所有汉字的Unicode范围是：\u4e00-\u9fa5
 * @author Admin
 */
/**
 *    生成一个包含所有汉字的字符串 "一"字开始"\4e00 到9fa5
 *    思路:
 *    1.既然是包含所有,肯定是从一个字符,到另一个字符之间的所有字符
 *    2.因为String对象每创建一个不一样的,都会开辟空间,避免浪费内存,用STringBuilder的拼接更好
 *  3.因为是输出所有拼接后的问题,所以用循环
 *  4.为了避免太多一行显示不下,50个一换行显示,所以需要一个计数器
 *
 *  步骤
 *  1.循环变量初始化,这里循环变量应该是字符 c(\u4e00) ,
 *  在不断的加1 c++,循环到最后1个字符结束c<=\u9fa5
 *  2.因为有计数器i,所以拼接一个字符,应该加一个计数i++
 *  3.循环体内,建立StringBuilder对象.
 *  每次循环拼接sb.append(c)
 *  4.等i到50个,就sb.append("\n")
 *  注意:计数器从1开始,不然第一个字,i%50 0 取模50,结果是0,会换行
 *  输出语句放在最外面,直接输出sb对象.
 */
public class Test07 {
    public static void main(String[] args) {
        int i=0;
        StringBuilder sb=new StringBuilder();
        for (char c='\u4e00';c<='\u9fa5';c++,i++) {
            sb.append(c);//拼接字符串
            if (i%50==0){//50个字换行
                sb.append("\n");//\n指换行
            }
        }
        System.out.println(sb.toString());
    }

}
