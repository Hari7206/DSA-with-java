package Array.mediumproblem.rearrange;
//  here we don't have any better version cause of the its space cause it can't be change that so 
public class optimal {
    public static void main(String[] args) {
        int arr[] = {3 , 1 , -2 , -5 , 2 , -4};
        int ansArr[] = new int[arr.length ];
        int postind = 0;
        int negind = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                ansArr[negind] = arr[i];
                negind += 2;
            }
            else {
                ansArr[postind] = arr[i];
                postind += 2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println(ansArr[i]);
        }
    }
}
