package Array.arrayproblem;
// here we will find the missing number array
// brute force approch 
public class missing {
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 4 , 5};
        for (int i = 1; i < arr.length; i++) {
            int fnum = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == i) {
                    fnum = 1;
                    break;
                }
            }
           if (fnum == 0) {
            System.out.println("The missing number is " + i);
           }
        }
    }
}
