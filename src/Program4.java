public class Program4 {
    public static void main(String[] args) {
        int num=123456;
        int rem=0;
        int evencount=0;
        int oddcount=0;
        while(num>0)
        {
            rem=rem*10+(num%10);
            if(rem%2==0)
            {
               evencount++;
            }
            else {
                oddcount++;
            }
            num=num/10;
        }
        System.out.println("The even count is "+evencount);
        System.out.println("The even count is "+oddcount);
    }
}
