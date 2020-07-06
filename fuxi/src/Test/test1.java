package Test;

import java.util.Scanner;

public class test1 {
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
