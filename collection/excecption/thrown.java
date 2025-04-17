package collection.excecption;

import java.util.Scanner;

public class thrown {
    // so here we will see that how we use the trow to make our coustom exception handling
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter any number less then 100 ");
           
                int age = sc.nextInt();
                if (age > 100) {
                        throw  new Myextension("The error is this ");
                }
            } catch (Myextension e) {
  System.out.println(  e.getMessage());
            }
        }
    }
    
 class Myextension extends Exception {
    
public Myextension (String message) {
        super(message);
}
    // here our done of the throw custom exception making 
}
