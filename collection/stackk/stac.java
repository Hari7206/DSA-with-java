package collection.stackk;

import java.util.Stack;

// here we see how we use the interface of the stack which is already define in the java collection
public class stac {
    public static void main(String[] args) {
        // stack 
        Stack<String> BookName = new Stack<>();

        // now we see the function of the stack

        // push  - use to add the new item to the stack
        BookName.push("Harry Potter");
        BookName.push("ikigai");
        BookName.push("Attomic Habbit");
        BookName.push("New way");
        BookName.push("Right path");
        System.out.println("stack added are : "+BookName); // no our all this item is add to the stack

            // peek - to see the last element we add 
        
        System.out.println(" this is the last item : "+BookName.peek());

        // Pop :- this is use to take out the last element which we add and it complete the stack 
        
        BookName.pop();
        System.out.println("after the last element is out again "+BookName);
        // and stack completed here 
    }
}
