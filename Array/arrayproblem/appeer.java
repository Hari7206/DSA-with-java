package Array.arrayproblem;
public class appeer {
    // so here we willl use the brute force for the unique number 
    public static void main(String[] args) {
        // here we will assign the unqiue number
        int arr[] = {1 , 1 , 2 , 2 , 3 , 4 , 4 , 5 , 5};

        // our first itration start here
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int num = arr[i];
            // here for the checking the itrations
            for (int j = 0; j < arr.length; j++) {
                if (num == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[i] +" this is not repeating number");
            }
        }
    }
}
