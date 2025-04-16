package collection.priorityQue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class prioQuesec {
    // here we will do the code same as the priority code but the difference is only that we will add the constructor here
    public static void main(String[] args) {
          Queue<Integer> queues = new PriorityQueue<>(Comparator.reverseOrder());
        // here all the queue function also work because the implement is done with the help of the priority
        queues.offer(45);
        queues.offer(35);
        queues.offer(65);
        queues.offer(95);
        queues.offer(05);
         
        System.out.println(queues);  // see here it will retrun the number as the big first
    
        // we have pop and peak in this also
        queues.peek(); // it will show the smallesst will out 
        System.out.println(queues.poll());
        System.out.println("the big will out"+queues);
    
    }
}
