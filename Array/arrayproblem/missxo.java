package Array.arrayproblem;
// so here we will see the better version of the fiding misssing number
public class missxo {
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 4 , 5 };
        int n = 5;
        int xorOne = 0;
        int xorTwo = 0;
        for (int i = 0; i < arr.length; i++) {
            xorOne = xorOne ^ arr[i];
            xorTwo = xorTwo  ^ (i + 1);
        }
        xorTwo = xorTwo ^ n;
      int result =   xorOne ^ xorTwo;
      System.out.println(" our missing number is "+result);
    }
}
