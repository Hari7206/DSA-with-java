package Array.mediumproblem.subarray;

public class brute {
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3 , -3 , 1  , 1 , 1  , 4 , 2 , -3};

        int k = 3;
            int cout = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int sum = 0;
                for (int m = i; m < j; m++) {
                    sum = sum + arr[m];
                }
                if (sum == k) {
                    cout++;
                }
            }
        }
        System.out.println(cout);
    }
}
