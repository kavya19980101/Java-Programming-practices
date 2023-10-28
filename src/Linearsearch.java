public class Linearsearch {
    public static void main(String[] args) {
        int a[]={20,39,89,90,10};
        int search=10;
        boolean flag=false;
        for(int i=0;i<=a.length-1;i++)
        {
            if(search==a[i])
            {
                System.out.println("Finded serach element in position "+i);
                flag=true;
            }
        }
        if(flag==false)
        {
            System.out.println("Search element not found");
        }
    }
}
