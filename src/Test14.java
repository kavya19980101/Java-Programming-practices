public class Test14 {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int sum1=0;
        int sum2=0;
        for(int i=0;i<=arr.length-1;i++){
           sum1=sum1+arr[i];
        }
        for(int i=1;i<=5;i++){
         sum2=sum2+i;
        }
        System.out.println(sum2-sum1);
    }
}
