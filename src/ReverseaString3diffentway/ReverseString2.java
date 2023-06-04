package ReverseaString3diffentway;

import java.util.Scanner;

public class ReverseString2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.next();
        String rev="";
        char a[]= str.toCharArray();
        int len=str.length();

        for(int i=len-1;i>=0;i--)
        {
            rev=rev+a[i];
        }
        System.out.println("The reverse of the string is "+rev);
    }
}
