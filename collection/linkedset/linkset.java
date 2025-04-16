package collection.linkedset;
// this is used to set the data in a order way the only the differnce is that from the hashset cause with the set it used thee property of linkedlist 

import java.util.LinkedHashSet;
import java.util.Set;

public class linkset {
    public static void main(String[] args) {
        Set <Integer> linkedset = new LinkedHashSet<>();
        linkedset.add(56);
        linkedset.add(87);
        linkedset.add(89);
        linkedset.add(56);  // here we will that our 56 will never print again cause of the unqiue set 
        linkedset.add(78);
        linkedset.add(23);
        linkedset.add(67);
        System.out.println(linkedset);

        // all the other property are same as the hashset 
    }
}
