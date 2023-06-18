public class Test8 {
    public static void main(String[] args) {
        int num=12345;
        int even_count=0;
        int odd_count=0;

        while(num>0)
        {
           int a=num%10;
            if(num%2==0){
            even_count++;}
            else{
                odd_count++;}
            num=num/10;
        }


        System.out.println("The even number is"+even_count);
            System.out.println("The odd number is"+odd_count);
    }
}
