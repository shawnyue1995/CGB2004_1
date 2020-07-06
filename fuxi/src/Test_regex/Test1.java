package Test_regex;

import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        String content="I am noob"+"from runoob.com";
        String pattern=".*runoob.*";// .*runoob.* 用于查找字符串中是否包了 runoob 子串
        boolean ismatch= Pattern.matches(pattern,content);
        System.out.println("是否包含了'runoob'"+ismatch);
    }
}
