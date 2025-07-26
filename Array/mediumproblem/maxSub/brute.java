package Array.mediumproblem.maxSub;

public class brute {
    public static void main(String[] args) {
        int arr[]  = {-2 , -3 , 4 , -1 , -2 , 1 , 5 , -3};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int subarr = 0;
            for (int j = i; j < arr.length; j++) {
                subarr =subarr + arr[j];
               max = Math.max(subarr, max);
            }
        }
        System.out.println(max);
    }
}
