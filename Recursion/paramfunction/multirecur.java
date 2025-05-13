package Recursion.paramfunction;
// so here we will do the multiple recursion as we call before only single recursion now we will call multiple recursion
public class multirecur {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("so our fibonachi number is " + n);
        int result = f(n);
        System.out.println("our " +n+" number of recursion is "+result);
    }
   public static int f(int n) {
    if (n <= 1 ) {
        return n;
    }
   int  last =  f(n - 1);
   int seclast = f(n - 2);
   return last + seclast;
   }
}
