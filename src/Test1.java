public class Test1 {
    public static void main(String[] args) {
        String str = "kak";
        String pal = str;
        String rev = "";
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);

        }
        if(pal.equals(rev)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }

    }
}


