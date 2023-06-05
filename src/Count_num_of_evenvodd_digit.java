public class Count_num_of_evenvodd_digit {
    public static void main(String[] args) {

        int num=123456;
        int count_even=0;
        int count_odd=0;
        while(num>0)
        {
            int rev=num%10;
            if(rev%2==0)
            {
                count_even++;
            }
            else{
                count_odd++;
            }
            num=num/10;

        }
        System.out.println("The number of digit are "+count_even);
        System.out.println("The number of digit are "+count_odd);



    }}
