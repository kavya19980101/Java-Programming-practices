import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        Scanner sc3=new Scanner(System.in);
        System.out.println("enter a  value");
        int a=sc.nextInt();
        System.out.println("enter b value");
        int b=sc.nextInt();
        System.out.println("enter c value");
        int c=sc.nextInt();

      /*  if(a>b && a>c)
        {
            System.out.println("A is greater");
        }
        else if (b>a && b>c)
        {
            System.out.println("B is greater");
        }
        else
        {
            System.out.println("C is greater");
        }*/

       int largest= a>b?a:b;
       int largest2= largest>c?largest:c;
       System.out.println(largest2+" is a greater");


    }
}
