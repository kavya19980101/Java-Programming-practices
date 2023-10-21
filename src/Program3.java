import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
int num=sc.nextInt();
int rem=0;
int count=0;
while(num>0)
{
    rem=rem*10+(num%10);
    count++;
    num=num/10;
}
System.out.println("The count of the digit is "+count);
    }
}
