public class Test2 {
    public static void main(String[] args) {
        int num=121;
        int original=num;
        int rev=0;
        while(num>0)
        {
         rev=rev*10+num%10;
         num=num/10;
        }
        if(original==rev) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
