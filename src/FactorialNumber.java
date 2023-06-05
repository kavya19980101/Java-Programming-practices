
//natural number> 1-->done
//which as 2 factor should divide by 1 and itself

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number1");
        int num=sc.nextInt();
        int count=0;

            if (num > 1) {
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0)
                        count++;
                }
                if (count == 2) {
                    System.out.println("The number is prime no");
                } else {
                    System.out.println("The number is not a prime no");
                }
            } else {
                System.out.println("The number is not a prime no");
            }



    }
}