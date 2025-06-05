package Array.arrayproblem;
import java.util.ArrayList;
// we have to rotate to the deft side of the array  means we will move to the d side whatever side is given to us
public class leftd {
    public static void main(String[] args) {
        
        ArrayList<Integer> temp = new ArrayList<>();
        int arr[] = {54 , 67 , 3 , 87 , 32 , 78 , 4};
        int d = 3;
        int n = arr.length;
   
           for(int i=0; i < 3; i++) {
              temp.add(arr[i]);
           }

            for(int i=d; i < n; i++) {
                   arr[i - d] = arr[i];
            }

            for (int i = n-d; i < n; i++) {
                arr[i] = temp.get(i-(n-d));
            }
            for (Object elem : arr) {
                System.out.println(elem);
            }
    }
 } 