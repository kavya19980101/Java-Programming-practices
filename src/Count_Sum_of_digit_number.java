public class Count_Sum_of_digit_number {
    public static void main(String[] args) {
  int num=1234;
  int sum=0;
  while(num>0)
  {
      sum=sum+num%10;
      num=num/10;
  }
  System.out.println("the sum of difgit is "+sum);
    }
}
