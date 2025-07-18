package Array.mediumproblem.zeroOnceshort;
// here we will do the brute of this 
public class brute {
    public static void main(String[] args) {
        int arr[] = {0  , 1  , 0 , 2 , 1 , 0 , 1, 2 , 1   ,0};
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for (int elem : arr) {
            System.out.println(elem);
        }
    }
}
