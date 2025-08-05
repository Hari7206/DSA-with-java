package Array.mediumproblem.subarray;

public class better {
    // so here we will do the better approch 
    public static void main(String[] args) {
          int arr[] = {1 , 2 , 3 , -3 , 1  , 1 , 1  , 4 , 2 , -3};
            int k = 3;
            int cout = 0;
          for (int i = 0; i < arr.length; i++) {
                int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k ) {
                    cout++;
                }
            }
          }
          System.out.println(cout);
    }
}
