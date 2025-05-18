package Shorting;

// so here we will do the selectio  shorting 
public class selection {
    public static void main(String[] args) {
        int arr[] = {13 , 46, 20 , 24 , 52 , 9};   
        for (int i = 0; i < arr.length; i++) {
            int minim = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minim]) {
                   minim = j;
                }
            }
            int temp = arr[minim];
               arr[minim]  = arr[i];
               arr[i] = temp;
        }
       for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
       }
    }
        }