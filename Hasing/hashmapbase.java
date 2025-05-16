package Hasing;
// in this  we again gonna do the same hasmap but this time in the deep 

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmapbase {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<Integer , String> data = new  HashMap<>();
        // so this is how by the help of the put we can put the value in the map 
       data.put(60, " Hari");
       data.put(44, "vishwas");
       data.put(31, "pratik");
       data.put(78, "shivam");
       System.out.println(data);

       // this is how we can get the data of the any key by the help of the key
       String datas = data.get(60);
       System.out.println(datas);
// this is how we can check wheather  the any key or value is present in the map or not 
      System.out.println( data.containsKey(45));


      // now looping in the map
      for (Integer elem : data.keySet()) {
          System.out.println("\n"+data.get(elem));
      }
      // by the help of the key set we can get in the loop of every value in the loop 

      // for more advance function we can use the thing like map entery set where we can do the both thing like one time key and the value print 
     
      Set<Map.Entry<Integer , String>> entriees = data.entrySet();
      for (Map.Entry<Integer , String> entry : entriees) {
          System.out.println( "The key of "+entry.getKey()+ " value is " + entry.getValue());
      }
    }
}
