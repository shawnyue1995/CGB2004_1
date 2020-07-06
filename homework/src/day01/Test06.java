package day01;

import java.util.Scanner;

/**
 * 用户从控制台输入一个字符串，须至少包含一个“/”，如果没有，给出错误提示；
 * 如果有，获取最后一个“/”后的字符串。
 * @author Admin
 */
public class Test06 {
    public static void main(String[] args) {
        boolean flag=false;
        while(flag==false){
            System.out.println("请输入一段字符串");
            String input=new Scanner(System.in).nextLine();
            boolean b=input.contains("/");
            if (b==true){
                System.out.println("输入正确！");
                flag=true;
            }else{
                System.out.println("至少包含一个/");
            }
        }

    }
}
