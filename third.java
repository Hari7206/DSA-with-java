package simple;
// here we will see that we create the no of the row of 5 
/*
 like  5 times rows 
 1
 12
 123
 1234
 12345
 */
public class third {
    public static void main(String[] args) {
        runfunthird(6);
        
    }
    public static void runfunthird(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
