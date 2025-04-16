package collection.Array_decque;
// here we will see that how our array decque will work it function are same as the queue work only the difference is that we can use this for both the add at the first and add at the last it mainly or widly used for the making the slide which are continous like the amazone slides 

import java.util.ArrayDeque;

public class decqu {
    public static void main(String[] args) {
        ArrayDeque<Integer> dec = new ArrayDeque<>();
        dec.offer(5);  // this is how we cann add any number normally 
        dec.offer(5);
        dec.offer(5);

        // offerfirst - with this we can add the elemet at the first 
        dec.offerFirst(45);

        // offer last - with this we can add the element at the last 
        dec.offerLast(56);
        System.out.println(dec);

        // then we have the function of the  peek where we can see what the output get out now 
        // we have the peek first and last function to see the both the last and the first 

        System.out.println(dec.peek());  // now we can see that default use of the peek is to see the first as the queue work but we can see both the first and the last with the help of the array decquee

        System.out.println("the last peek of the queue is "+dec.peekLast());

        // now in the pool we have two type of pool like 

        System.out.println(dec.pollLast());
        System.out.println("it is the answer of our after we remove the last element "+dec);



    }
    
}
