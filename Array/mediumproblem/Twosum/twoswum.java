package Array.mediumproblem.Twosum;
import java.util.Arrays;
// optimal verison of the two sum 
public class twoswum {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        Arrays.sort(arr);  
        int left = 0; 
        int right = arr.length-1;
        while (left < right) {
            if (arr[left] + arr[right] == target ) {
                System.out.println("this has presen the shorted value");
                break;
            }
            else if (arr[left] + arr[right] < target) {
                left++;
            }
            else {
                right--;
            }
        }
    
}
}