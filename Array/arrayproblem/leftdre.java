package Array.arrayproblem;
// here we will do the left reverse bu in the optimal method 
public class leftdre {
    public static void main(String[] args) {
        int arr[] = { 45 ,67 , 89 , 90 , 21 , 56 };
        int n = arr.length;
        int d = 3;

        for (int i = 0; i < d / 2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[d-i-1];
            arr[d-i-1] = temp;
        }
        
        // for (int i = 0; i < 3; i++) {
        //     System.out.println(arr[i]);
        // } .. 


// Reverse from d to n-1 (i.e., 90, 21, 56)
for (int i = d, j = n - 1; i < j; i++, j--) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
// for (int i = d; i < arr.length; i++) {
//     System.out.println(arr[i]);;
// }

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]);
        }
         


    }

    
}
