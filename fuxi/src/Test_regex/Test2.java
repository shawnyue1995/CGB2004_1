package Test_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) {
        //按指定模式在字符串查找
        String line="This order was placed for QT3000!OK?";
        String pattern="(\\D*)(\\d+)(.*)";//\D 非数字： [^0-9]//\d  数字：[0-9] //. 任何字符（与行结束符可能匹配也可能不匹配
        //*表示零次或多次匹配前面的字符或子表达式。例如，zo* 匹配"z"和"zoo"。* 等效于 {0,}。
        //+表示一次或多次匹配前面的字符或子表达式。例如，"zo+"与"zo"和"zoo"匹配，但与"z"不匹配。+ 等效于 {1,}。
        //创建正则对象
        Pattern r= Pattern.compile(pattern);
        //现在创建matcher对象
        Matcher m=r.matcher(line);
        if (m.find()){
            System.out.println("Found Value:"+m.group(0));
            System.out.println("Found Value:"+m.group(1));
            System.out.println("Found Value:"+m.group(2));
            System.out.println("Found Value:"+m.group(3));
        }

    }
}
