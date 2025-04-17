package collection.list;
import java.util.*;
// here we will see how to use the arry function in arry list 
public class list_fun {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // first add
        list.add(4);
        list.add(44);
        list.add(45);
        list.add(564);
        list.add(64);
        list.add(634);
        list.add(34);
        list.add(94);  // this is how we can add the new function in the java by adding the add and it always add at the last
        System.out.println("\nold list");
        System.out.println(list);

        // add all - help to add one list with the other list 
        ArrayList<Integer> NewList = new ArrayList<>();
        NewList.add(56);
        NewList.add(108);
        NewList.add(78);
        NewList.add(90);  
        
        list.addAll(NewList);
        System.out.println("\nthis is after adding the new list to the old list ");
        System.out.println(list);

        // add get from which we can get the data to get and print 
        System.out.println("\nThe get data  is : "+list.get(5));

        /* remove - used to remove the any element 
          two type of remove we have 
          list.remove(index no)  to remove with the help of the function

          list.remove(list.valueof(by wrinting the value))
        */ 
        list.remove(Integer.valueOf(45));  // here our value of 45 is removed 
        System.out.println("this is after i remove the 45 "+list);

        // clear - used to clear the all the data     used as list.clear

        // then we have the property of the set from which we can set the any value  at any index
        list.set(2, 45); // here first we chosse the index and then element
        System.out.println("This is after i add again the 45 by get"+list);  // but it remove the old one update that

        // contain value it is used to check wheater the contain is present or not  . this is one conditon so use with the if else
        if (list.contains(0)) {
            System.out.println("\nyes the number is present");
        }
        else {
            System.out.println("\n no it is not in the list");
        }

        /* the last one but not the least one 
         
         *  there is different way to traverse the list  3 main type
         * first is using the for loop
         */
        for (int index = 0; index < list.size(); index++) {
            System.out.println("the element is : " + list.get(index));
        }
        //  second way is using the for each
        System.out.println();
        for (Integer Least_num : NewList) {
            System.out.println("By using the for each loop" + Least_num);
        } 
        /* and the last way is by using the itrator 
         this is basically another thing using the function 
         this have the function like which check the next function 
         */ 
        Iterator<Integer> it =  list.iterator();
        while (it.hasNext()) {
            System.out.println("iterator value is : "+it.next());
        }
    }

    
}
