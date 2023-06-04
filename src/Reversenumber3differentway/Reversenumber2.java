package Reversenumber3differentway;

import java.util.Scanner;

public class Reversenumber2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
       int num= sc.nextInt();
         StringBuilder a=new StringBuilder(String.valueOf(num));
         StringBuilder rev= a.reverse();
         System.out.println("The reverse value is "+rev);
    }
}
