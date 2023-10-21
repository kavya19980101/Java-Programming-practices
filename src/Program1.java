public class Program1 {
    public static void main(String args[])
    {
        int a=10, b=20;
        //Using a third Variable
       /* int temp=a;
        System.out.println("The a value is "+a+" The b value is "+b);
        a=b;
        b=temp;
        System.out.println("The value of a after swapping "+a+" The value of b after swapping "+b);*/

        //Using + and - operator;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("The value of a after swapping "+a+" The value of b after swapping "+b);
    }
}
