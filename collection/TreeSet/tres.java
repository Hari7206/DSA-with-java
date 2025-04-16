package collection.TreeSet;
// our tree set also used the implementation of the set the only difference from the other is that it used the shorting formation means it print the data in the accending order 
import java.util.Set;
import java.util.TreeSet;

public class tres {
    public static void main(String[] args) {
        Set <Integer>  tress = new TreeSet<>();
        tress.add(56);
        tress.add(87);
        tress.add(89);
        tress.add(56);  // here we will that our 56 will never print again cause of the unqiue set 
        tress.add(78);
        tress.add(23);
        tress.add(67);
        System.out.println(tress);  // here we will see that our set is form in the accending order . 
    }
}
