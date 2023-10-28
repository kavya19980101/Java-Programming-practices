public class MaxMinElementinArray {
    public static void main(String[] args) {
        int a[]={20,80,30,10,20};
        int max=a[0];
        int min=a[0];
        for(int i=1;i<= a.length-1;i++)
        {
            if(a[i]>max)
            {
              max=a[i];
            }
        }
        System.out.println("the max value is "+max);
        for(int i=1;i<= a.length-1;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("the min value is "+min);
    }
}
