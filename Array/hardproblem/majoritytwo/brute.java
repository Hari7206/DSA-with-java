package Array.hardproblem.majoritytwo;

public class brute {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 2, 2, 2};
        int n = arr.length;
        int threshold = n / 3;

        int maxCount = 0;
        int majorityElement = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                majorityElement = arr[i];
            }
        }

        if (maxCount > threshold) {
            System.out.println("Majority element (> n/3): " + majorityElement);
        } else {
            System.out.println("No majority element found.");
        }
    }
}
