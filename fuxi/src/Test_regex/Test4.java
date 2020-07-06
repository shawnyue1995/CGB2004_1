package Test_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//matches 和 lookingAt 方法
public class Test4 {
    private static final String REGEX ="\\bcat\\b";//\b 单词边界
    private static final CharSequence INPUT ="cat cat cat cattie cat" ;

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT); // 获取 matcher 对象
        int count=0;
        while(m.find()) {
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+m.start());
            System.out.println("end(): "+m.end());
        }
    }
}
