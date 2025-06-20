package Array.arrayproblem;
// so here we will see the better version of the fiding misssing number
public class missxo {
    public static void main(String[] args) {
        // here assingn the array 
        int arr[] = {1 , 2 , 4 , 5 };
        int n = 5;
        // here we start the zero and the one of the xors
        int xorOne = 0;
        int xorTwo = 0;
        for (int i = 0; i < arr.length; i++) {
            // here we will asssing the alll value to the one
            xorOne = xorOne ^ arr[i];
            xorTwo = xorTwo  ^ (i + 1);
            // here we are assing value to the xor 2
        }
        xorTwo = xorTwo ^ n;
        // here our left one which is 5 we also got this
      int result =   xorOne ^ xorTwo;
      // at last we will get our main xor value which is missing 
      System.out.println(" our missing number is "+result);
    }
}
