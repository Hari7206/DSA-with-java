package collection.excecption;
// so here we will see the how the trows work we have two thing one is throws and another is throw 
/*
 *  so our throws used to tell the other developer that here might be an error in the method so he can be alret to use the try catch in the function
 */
public class throwss extends Exception {
    public static void main(String[] args) {
        int arr[] = new int[8];

        try {
            retrunthing(arr);
            
        } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("the error is "+e.getMessage());
        }
    }
    public static int retrunthing ( int arr[]) throws ArrayIndexOutOfBoundsException  // here we havee give the throws and the exception type that can be --:
     {
            return  arr[8];  // so here we have already pass the function and after it we will call the function
    }
}
