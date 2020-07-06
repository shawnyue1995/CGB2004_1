package Test0523;

public class Test01 {
    public static void main(String[] args) {
        String str="HelloWorld";
        test1(str);
        test2(str);
        test3(str);
        test4(str);
        test5(str);
        test6(str);
        test7(str);
        test8(str);
        test9(str);

    }

    public static void test3(String str) {
        System.out.println(str.indexOf("o"));
    }   public static void test4(String str) {
        System.out.println(str.substring(0,5));
    }   public static void test5(String str) {
        System.out.println(str.substring(5));
    }   public static void test6(String str) {
        String str2="   Hello   ";
        System.out.println(str2.trim());
    }   public static void test7(String str) {
        System.out.println(str.charAt(6));
    }   public static void test8(String str) {
        System.out.println(str.startsWith("h"));
        System.out.println(str.endsWith("ld"));
    }   public static void test9(String str) {
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }

    public static void test2(String str){
        System.out.println(str.indexOf("o"));
        System.out.println(str.lastIndexOf("o"));
    }

    public static void test1(String str) {
        System.out.println(str.length());
    }
}