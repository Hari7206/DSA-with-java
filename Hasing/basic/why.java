package Hasing.basic;
// so here we will see one question after that our hasing will start
// so the question is to find how many time n number came in the array 
public class why {
    public static void main(String[] args) {
        int arr[] = { 4 , 5 , 2 , 1 , 6 , 2 , 1  ,  6 ,  6 , 8 , 1 , 4 , 12 , 456 , 1 };
        int  result = num(1, arr);
        System.out.println(result);
    }
    public static int num(int number , int arr[]){
        int cout = 0;
        for (int j = 0; j <arr.length; j++) {
            if (arr[j] == number ) {
                cout = cout + 1;
            }
        }
        return cout;     
        }
    }