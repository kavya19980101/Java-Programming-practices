package Palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int rev=0;
        int palindrome=num;
        while(num!=0)
        {
            rev=rev*10 + num%10;
            num=num/10;
        }

       if(palindrome==rev) {
            System.out.println("The number is palidrome");
        }
        else {
            System.out.println("The number is not palindrome");
        }
    }
}
