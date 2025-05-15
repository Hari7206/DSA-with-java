package Hasing.basic;
// here we will see that how we can find any character any time by the simmple method of the java
public class hashchar {
    public static void main(String[] args) {
        String str= "hari is a nice guy ";
       System.out.println(name('i', str)); 
    }
    public static int name( char name , String str) {
        int cout = 0;
        for (int i = 0; i < str.length(); i++) {
               if ( str.charAt(i) == name ) {
                cout++;
            }
        }
        return cout;
    }
}
