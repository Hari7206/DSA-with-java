package collection.queueLink;
// here we will see how the queue work with the linked list and make interface

import java.util.LinkedList;
import java.util.Queue;
// queue is nothing but a type from where we do first in and first out which means which comes the first and it out the first 
public class queue {
    public static void main(String[] args) {
        // queue interface
        Queue<Integer>  queues = new LinkedList<>();
        
        // now we will see the all function of this interface .
        // offer - this is used to add new item in the ques
        queues.offer(45);
        queues.offer(35);
        queues.offer(65);
        queues.offer(95);
        queues.offer(05);
        System.out.println(queues);

        // peek - this used to check the which is out now means which is going to out now 
        System.out.println( queues.peek());
        // poll -> this is used to make the out of the first function  that we have 
        queues.poll();
        System.out.println("this is the result after the poll : "+queues);

        // here our queue also completed .
    }
}
