public class Largest_of_3_num {
    public static void main(String[] args) {
        int a = 50, b = 40, c = 20;

       /* if (a > b && a>c) {
            System.out.println("A is a largest number");
        } else if (b>a && b>c) {
            System.out.println("B is a largest number");
        } else {
            System.out.println("C is a largest number");
        }*/
      int largest1=a>b?a:b;
      int largest2=largest1>c?largest1:c;
      System.out.println(largest2);
    }
}
