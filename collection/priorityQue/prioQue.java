package collection.priorityQue;
// here we will see the priority queue . 

import java.util.PriorityQueue;
import java.util.Queue;

/*
 * the priority queue is used to show the element based on their priorty like the min heao or the max heap it will show 
 * like the default of it is min heap and we can do it as the max heap also
 */
public class prioQue {
    public static void main(String[] args) {
        Queue<Integer> queues = new PriorityQueue<>();
        // here all the queue function also work because the implement is done with the help of the priority
        queues.offer(45);
        queues.offer(35);
        queues.offer(65);
        queues.offer(95);
        queues.offer(05);
        System.out.println(queues);  // see here it will retrun the number as the smallest first

        // we have pop and peak in this also
        queues.peek(); // it will show the smallesst will out 
        System.out.println(queues.poll());
        System.out.println("the smallest will out"+queues);
    }
}
