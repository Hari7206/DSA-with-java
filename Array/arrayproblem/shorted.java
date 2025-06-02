package Array.arrayproblem;

// 
public class shorted {
    public static void main(String[] args) {
         int arr[] = {90 ,89, 67 , 45 , 3 , 1};
         boolean shorted = true;
          for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1] > arr[i] ) {
             shorted = false;
             break;
            }  
        }
        if (shorted == true) {
            System.out.println("its an shorted array");
        }
        else{
            System.out.println("its an unshorted arrays");
        }
    }
}
