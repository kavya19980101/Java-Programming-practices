import java.util.Scanner;

public class Program2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
       int num=sc.nextInt();
       /*  int rev=0;
        while(num!=0)
        {
            rev=rev*10+(num%10);
            num=num/10;
        }*/
       /* StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();*/
        StringBuilder sb=new StringBuilder();
        sb.append(num);


        System.out.println("The value of Revere number is "+sb.reverse());
    }
}
