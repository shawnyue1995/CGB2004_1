package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Admin
 *
 */
public class Test04 {
    public static void main(String[] args) {
        boolean flag=false;
        while(flag==false){
            System.out.println("请输入email地址:");
            Scanner input=new Scanner(System.in);
            String s=input.nextLine();
            //(8-11)@(qq,163...).com
            String regex="[0-9]{8,11}@.{2,3}\\.com";
            Boolean matches=s.matches(regex);
            if (matches==true){
                System.out.println("邮箱格式输入正确！");
                flag=true;
            }else{
                System.out.println("邮箱格式输入错误！");
            }
        }
    }
}
