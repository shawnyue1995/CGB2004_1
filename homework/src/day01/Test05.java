package day01;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Admin
 *
 */
public class Test05 {
    public static void main(String[] args) {
        method();
    }
    public static void method() {
        boolean flag=false;
        while(flag==false) {
            //1、定义一个长度为5的数组，因为要生成的是一个5位的验证码
            String[] str = new String[5];
            //声明一个int类型的变量，并给它初始化
            int str1 = 0;
            //声明一个char类型的变量，并给它初始化
            char str2 = 0;
            //声明一个字符串类型的变量
            String str3 = "";

            //2、生成随机验证码
            for (int i = 0; i < 5; i++) {
                Random r = new Random();//随机生成数
                str1 = r.nextInt(58) + 65;//随机生成58个数，并从65开始
                str2 = (char) str1;//将整形的str转化成char类型的

                //ASCII 0-65 A-Z,97-122 a-z
                //如果生成的数是在90—97之间的，它会占用循环次数，生成的验证码可能不是5位的。
                if (str1 >= 65 && str1 <= 90 || str1 >= 97 && str1 <= 122) {
                    str3 = str2 + str3;//将字符依次加入字符串中
                } else {
                    i--;//返回再随机一次
                }
            }
            //3、输出验证码
            System.out.println("验证码是：" + str3.toString());

            //4、让用户输入验证码
            System.out.println("请输入验证码：");
            Scanner input = new Scanner(System.in);
            String s = input.nextLine();

            //5、判断验证码
            boolean b = s.equalsIgnoreCase(str3);//比较两个字符串，不用区分大小写，只用字母对就行了
            if (b == true) {
                System.out.println("验证码正确！");
                flag=true;
            } else {
                System.out.println("验证码错误！");
            }
        }

    }
}
