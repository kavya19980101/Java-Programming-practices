public class BinarySearch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int l=0, h=a.length-1, key=10;
        boolean flag=true;
        while(l<=h)
        {
            int mid=l+h/2;
            if(a[mid]==key)
            {
                System.out.println("Search Element found");
                flag=true;
                break;
            }
            if(a[mid]<key)
            {
                l=mid+1;
            }
            if(a[mid]>key)
            {
                h=mid-1;
            }
        }
        if(flag==false)
        {
            System.out.println("Search not found");
        }
    }
}
