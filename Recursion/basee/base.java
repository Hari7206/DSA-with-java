package Recursion.basee;
// this is the basic recursion function we used for the stop the stack overflow
public class base {
    static int cout = 0;
    public static void main(String[] args) {
        print();
    }
    public static void print() {
        if (cout==4) {  // this is we use the base condtion for the stop the stack overflow 
            return;
        }
        System.out.println(cout);
        cout++;
        print();
    }

}
