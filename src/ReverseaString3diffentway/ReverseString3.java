package ReverseaString3diffentway;

import java.util.Scanner;

public class ReverseString3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.next();
        StringBuilder rev=new StringBuilder(str);
        rev.reverse();
        System.out.println("The reverse of the string is "+rev);
    }
}
