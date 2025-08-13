package Array.hardproblem.mergersort;

import java.util.Arrays;

public class brute {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

       
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);

        
        System.out.println(Arrays.toString(nums1));
    }
}
