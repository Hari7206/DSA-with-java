package arraypractice.easy;
// so here we will see the brute force approch of the missing array number 


public class mised {
    public static void main(String[] args) {
        int arr[] = { 1 ,2  ,3 ,  5 , 6};
        for (int i = 1; i < arr.length; i++) {
            int missed = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == i) {
                missed = 1;
                break;
            }
        }
            if (missed == 0) {
           System.out.println("the missing number is " + i);
        }
        }
    }
}
