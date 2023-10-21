import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int rev=0;
        int originalnumber=num;
        while(num!=0)
        {
            rev=rev*10+(num%10);
        num=num/10;
        }
        if (originalnumber==rev){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }

    }
}
