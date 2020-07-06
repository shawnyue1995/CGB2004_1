package day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Admin
 *
 */
public class Test01 {
    public static void main(String[] args) {
        boolean flag=false;
        while(flag==false) {
            Scanner input = new Scanner(System.in);
            String s = input.nextLine();
            for (int i = 0; i <s.length(); i++) {
                if (s.charAt(i)=='.'){//判断是否含有小数点
                    Double d=Double.valueOf(s);
                    System.out.println(d*5);
                    flag=true;
                }else if ((int)s.charAt(i)>47&&(int)s.charAt(i)<58){
                    int in=Integer.valueOf(s);
                    System.out.println(in);
                    flag=true;
                }else{
                    System.out.println("不是数字！");
                }
            }
        }
    }
}
