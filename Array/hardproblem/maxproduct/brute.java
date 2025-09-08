package Array.hardproblem.maxproduct;

public class brute {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum products subarray: " + maxProduct(nums));
    }

    // Brute force O(n^2) appreachses
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = i; j < n; j++) {
                product *= nums[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }

        return maxProduct;
    }
}
