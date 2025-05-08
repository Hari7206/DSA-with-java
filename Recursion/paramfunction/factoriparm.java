package Recursion.paramfunction;
// print the factorial of first n number using the parameter way 
public class factoriparm {
    public static void main(String[] args) {
        fact(1 , 1 , 5);
    }
    public static void fact(int i , int facto , int n ){
        if(i > n) {
            System.out.println(facto);
            return;
        }
        fact(i+1 , facto * i , n);

    }
}
