package arraypractice.easy;
// so here we will check the consiqutiveness offs the 1 
public class consiqutive {
    public static void main(String[] args) {
        int arr[] = {1 , 1 , 0 , 1 , 1 , 1 , 0 , 0 , 1 };
        int count = 0;
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            //  
            if (arr[i] == 1 ) {
                count++;       
                if ( count > max) {
                    max = count;
                }
            }
            else {
                count = 0;
            }
        }
        System.out.println(max);
    }
}
