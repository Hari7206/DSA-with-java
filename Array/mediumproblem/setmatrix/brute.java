package Array.mediumproblem.setmatrix;

public class brute {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 1, 1, 1},
            {1, 0, 0, 1},
            {1, 1, 0, 1},
            {1, 1, 1, 1}
        };

        int n = arr.length;
        int m = arr[0].length;

        // Extra arrays to mark rows and columns
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        // First pass: mark rows and cols that should be zeroed
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Second pass: update the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] || col[j]) {
                    arr[i][j] = 0;
                }
            }
        }

        // Print the final matrix
        for (int[] r : arr) {
            for (int val : r) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
