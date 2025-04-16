package collection.hashSet;
// it is used to set the property using the set implementation . which is used for the only take the element one time if we get the 5 one time we can't get the element again

import java.util.HashSet;
import java.util.Set;


public class hashSet {
public static void main(String[] args) {
    Set <Integer> hash = new HashSet<>();
    // the uniqueness of it is that it will print the element in the unorder way that why it time complexity is  big O(n)
    hash.add(56);
    hash.add(87);
    hash.add(89);
    hash.add(56);  // here we will that our 56 will never print again cause of the unqiue set 
    hash.add(78);
    hash.add(23);
    hash.add(67);
    System.out.println("The element of the Hash are "+ hash);  

    hash.remove(89); // to remove any elemet

    System.out.println(hash.contains(56)); // it will check weather the element is present in the hashset or not  shows in the form true or false 

   System.out.println( "is our elememt is empty " + hash.isEmpty());
   System.out.println(hash.size());
   System.out.println("after all the function our  hash is "+ hash);

   // clear  -  this is used to clear the all the element in the hashset 
   

}    
}
