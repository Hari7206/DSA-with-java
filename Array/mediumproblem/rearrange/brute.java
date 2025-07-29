package Array.mediumproblem.rearrange;

public class brute {
    public static void main(String[] args) {
        int arr[] = {3 , 1 , -2 , -5 , 2 , -4};
        int postArr[] = new int[arr.length ];
        int negtArr[] = new int[arr.length ];


        int postind =0;
        int negind =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                postArr[postind++] = arr[i];
            }
        }
         for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negtArr[negind++] = arr[i];
            }
        }

        for (int i = 0; i < arr.length / 2 ; i++) {
          arr[2*i] = postArr[i];
          arr[2*i+1] = negtArr[i];
        }
       for (int i = 0; i < negtArr.length; i++) {
        System.out.println(arr[i]);
       }
    }
}
