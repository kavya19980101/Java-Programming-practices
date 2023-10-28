public class Test13 {
    public static void main(String[] args) {
String str=Rev("Hello");
       System.out.println(str);
    }

public static String Rev(String s) {
        int len=s.length();
    if (len== 0)
        return "";
    return s.charAt((len - 1)) + Rev(s.substring(0,len-1));
}
}