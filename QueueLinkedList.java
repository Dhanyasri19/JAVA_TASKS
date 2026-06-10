import java.util.*;
    public class QueueLinkedList {
        public static void main(String[] args) {
            Queue<Integer> queue = new LinkedList<>();

            // Enqueue operation
            queue.add(10);
            queue.offer(15); // Another way to add elements to the queue
            queue.add(20);
            queue.add(30);
            System.out.println("Queue after enqueuing: " + queue);

            // Dequeue operation
            int removedElement = queue.poll();
            System.out.println("Dequeued element: " + removedElement);
            System.out.println("Queue after dequeuing: " + queue);

            // Peek operation
            int frontElement = queue.peek();
            System.out.println("Front element: " + frontElement);

            // Check if queue is empty
            boolean isEmpty = queue.isEmpty();
            System.out.println("Is the queue empty? " + isEmpty);
        }


}