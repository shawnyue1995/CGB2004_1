package Test_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//replaceFirst 和 replaceAll 方法
public class Test5 {
    private static String INPUT ="dog" ;
    private static final String REGEX ="The dog says meow. " + "All dogs say meow." ;
    private static final String REPLACE ="cat" ;

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        // get a matcher object
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);
    }
}
