package Array.mediumproblem.majorityelement;

public class brute {
    public static void main(String[] args) {
        int[] arr = {2 , 2 , 3 , 3 , 1 , 2 ,2 };
        int n = arr.length/2;
        int result = 0;

        // To mark which elements we've already counted
        boolean[] visited = new boolean[arr.length];

        // Outer loop to pick each element
        for (int i = 0; i < arr.length; i++) {
            // Skip this element if it's already counted
            if (visited[i])
                continue;

            int count = 1; // fresh count for current element

            // Inner loop to count duplicates
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // mark duplicate as visited
                }
            }

            // Print the result for current element
            System.out.println(arr[i] + " -> " + count + " times");

            if (count > n) {
                result = arr[i];
            }
        }
        System.out.println("the element "+result +" is the majority element ");
    }
}
