package collection.map;
// this all functionality is same the only differenc is that from this we can prin the value or key in theh order way .

import java.util.Map;
import java.util.TreeMap;


public class tree_maps {
    public static void main(String[] args) {
         Map <String , Integer> maps = new TreeMap<>();
//  function of the maps are;

// put -: it is used to store the key and the value 

    maps.put("One", 1);
    maps.put("Two", 2);
    maps.put("Three", 3);
    maps.put("Four", 4);
    maps.put("Five", 5);
    System.out.println("The key value pairs are \n"+maps);

    // now if we put the  another value in the same key it will change the value of the key by its own .
    maps.put("Two", 8);
    System.out.println("After updating the value of the key is \n" + maps);
    // and the hashmap will shows the value always in the unorderd way;


    // put if absent -: this used to resolve the default way if our value is already declared it will not update the  new value 
    maps.putIfAbsent("Two", 9);  // as we will see that it will not update anyvalue


    // :---------- Iteration in Map ----:

    for (Map.Entry<String , Integer> no : maps.entrySet()) {
        // System.out.println(no); // here it will print as the unorder or vary strange order 

        // for print the key value only 
        // System.out.println("The only keys are \n"+no.getKey());
        System.out.println("The only value are \n"+no.getValue());


        // so this is used to print the only value ->

    }

    // here we will that this print the value at first of five than other

System.out.println(maps.containsKey("One")); // by this wqe can see that if the key is present or not
System.out.println(maps.containsValue(45));   // by this we can chcek weather the value is present or not 


// one more function that here is we will see that we have the function of the remove 
        maps.remove("One");  // here we will see that it will remove the one key ---> 
        System.out.println(maps);
    }    
}
