// Removed incorrect package declaration
/**
 * This package `simple` is used to group related classes and interfaces 
 * together. It helps in organizing the codebase and avoiding name conflicts.
 */
package simple;
public class fifth {
    public static void main(String[] args) {
        fifthrun(5);
    }
    public static void fifthrun(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
