package Array.arrayproblem;
// here we will find the missing number array
// brute force approch 
public class longsuub {
public static void main(String[] args) {
    int arr[] = {1 , 2 , 3  , 1 , 1 , 1 , 1 , 3 , 3 };
    int subm = 0;
    int right = 0;
    int left = 0;
    int longleng = 0;
    int n = arr.length;
    int k = 6;

    while (right < n) {
        subm = subm + arr[right];
        while (left  <= right && subm > k ) {
            subm = subm - arr[left];
            left++;
        }
        if (subm == k) {
            longleng = Math.max(longleng, right - left + 1);
        }
        right++;
    }
    System.out.println(longleng);
}
}