import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
Rev t1=new Rev();
t1.Reverse("Hello");
        System.out.println(t1.Reverse("Hello"));
    }
}
class Rev {

    public String Reverse(String s) {
        if (s.length() == 0)
            return "";
            return s.charAt(s.length() - 1) + Reverse(s.substring(0, s.length() - 1));

    }
}



