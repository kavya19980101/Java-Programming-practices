public class FindMissingnumberingArray {
    public static void main(String[] args) {
        int a[]={1,2,5,3};
        int sum=0;
        int sum1=0;
        for(int i=0;i<=a.length-1;i++)
        {
            sum=sum+a[i];
        }
        for(int i=0;i<=5;i++)
        {
            sum1=sum1+i;
        }
        int missing_value=sum1-sum;
        System.out.println("the missing value is the array "+missing_value);
    }
}
