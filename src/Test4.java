import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String value");
        String str=sc.next();
         int len=str.length();
         String original=str;
         String rev="";
         for(int i=len-1;i>=0;i--)
         {
             rev=rev+str.charAt(i);
         }
         if(original.equals(rev))
        System.out.println("Palindrome");
         else
             System.out.println("Not a Palindrome");
    }
}
