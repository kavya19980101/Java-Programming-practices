public class SumofElementArray {
    public static void main(String[] args) {
        int[] a={20,30,40,10,90};
        int sum=0;
        for(int i=0;i<=a.length-1;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("The sum of digit of number "+sum);
    }
}
