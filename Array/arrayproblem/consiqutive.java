package Array.arrayproblem;
// find max consiqutive 1 in the array 
public class consiqutive {
    public static void main(String[] args) {
        // here assign 1
        int arr[] = {1 , 1 , 1 , 1 , 1, 0 , 0 , 1 , 1 , 1  , 0 , 0  , 1 , 1 , 1 , 1 , 0 };
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                // here when ever our count is max the max we will assign it the values 
          if (count > max) {
              max = count;
          }
            }
            else {
                count = 0;
            }
        }
        System.out.println("max "  + max +"\n"+"count "+ count);
    }
}
