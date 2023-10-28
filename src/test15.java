public class test15 {
    public static void main(String[] args) {

            String arr[] = {"jmhb1", "klnm,2", "lml.2", "k,jn4", "kmjhbkj5"};
            boolean flag = false;
            for (int i = 0; i < arr.length ; i++) {
                for (int j = i + 1; i < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println("the duplicate number is" + arr[i]);
                        flag = true;
                    }
                }
            }
            if (flag == false) {
                System.out.println("the duplicate not found");
            }
        }




}
