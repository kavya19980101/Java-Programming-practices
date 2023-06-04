package Reversenumber3differentway;

import java.util.Scanner;

public class Reversenumber3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        StringBuffer sb=new StringBuffer();
        sb.append(num);
        StringBuffer rev=sb.reverse();
        System.out.println("The reverse value is "+rev);
    }
}
