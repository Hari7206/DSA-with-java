package Array.mediumproblem.majorityelement;

public class optimal {
    public static void main(String[] args) {
        int arr[] = {7 , 7 , 5 , 7 , 5 , 1 , 5 , 7 , 5 , 5 , 7 , 7 , 5 , 5 , 5,5};
        int count = 0;
        int elemnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count++;
                elemnt = arr[i];
            }
            else if (elemnt == arr[i]) {
                count++;
            }
            else {
                count--;
            }
        }
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (elemnt == arr[i]) {
                count1++;
            }
        }
        if (count1 > arr.length / 2) {
            System.out.println("here the present the majority elemnt ");
        }

    }
}
