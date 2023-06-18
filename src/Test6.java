public class Test6 {
    public static void main(String[] args) {
        int num=123;
        int even_count=0;
        int odd_count=0;
        while(num>0) {
            int rev = num % 10;
            if (num % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
            num=num/10;
        }

        System.out.println("total of even  numbers is"+even_count);
        System.out.println("total of odd  numbers is"+odd_count);
    }
}
