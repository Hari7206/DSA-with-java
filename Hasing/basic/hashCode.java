package Hasing.basic;
// so here we will make our code print the how many time any number came in any array 
public class hashCode {
    public static void main(String[] args) {
        // first our array 
        int arr[] = { 45 , 34 , 34 , 67 , 1 , 56 , 45 , 89 , 5 , 6 , 23 , 67 , 5 ,34};

        int hash[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }


        // then here we will see the query 
        int query[] = {34 , 5 , 1 ,  67 , 6};
        for (int elem : query) {
           int resu = hash[elem];
           System.out.println(resu);
        }
    }
}
// this is how our hash make the code easy to print the anu number of values 