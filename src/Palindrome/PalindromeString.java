package Palindrome;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.next();
        String original=str;
        String rev="";
        int len=str.length();
        for(int i=len-1 ; i>=0 ; i--)
        {
            rev=rev+str.charAt(i);
        }
        if(original.equals(str)){
            System.out.println("The String palindrome");
        }
        else{
            System.out.println("The String not a palindrom");
        }
    }
}
