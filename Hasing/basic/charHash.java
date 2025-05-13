package Hasing.basic;
// so here we are gonna do the same question as we done befoe on the number now we will do with the character
public class charHash {
    public static void main(String[] args) {
         String s = "hari is the boss ";
         // here we will declare the hasing tecnique 
         int hash[] = new int[256];
         for (int i = 0; i <s.length(); i++) {
            hash[s.charAt(i)]++;
         }

         // now making querry 
         char querry[] = {'h' , 's' , 'i' , 'f'};
        for (char ele : querry) {
            System.out.println(hash[ele]);
        }
    }
}
