package Array.arrayproblem;
// this is the version of the better version
public class missingop {
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 4 , 5};
        int n =5;
         int[] hash = new int[n + 1];
          for (int i = 0; i < n-1; i++) {
            hash[arr[i]] = 1;
          }
          for (int j = 1; j < n; j++) {
            if (hash[j] == 0) {
               System.out.println("missing number is " + j);
            }
          }
    }
}
