public class Extractoddevennumberfromarray {
    public static void main(String[] args) {
        int[] a={2,3,6,9,12,24};
        System.out.println("the even number are:");
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]%2==0)
                System.out.println(a[i]);
        }
        System.out.println("the odd number are:");
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]%2!=0)
                System.out.println(a[i]);
        }
    }
}
