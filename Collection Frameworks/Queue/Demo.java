import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        // Single Ended Queue

        // Enqueue
        queue.add(1);// Throws exception
        queue.offer(2);// Safe return False
        queue.offer(3);

        System.out.println(queue);

        // Front Access
        System.out.println(queue.peek());// Safe return null
        System.out.println(queue.element());// Throws exception

        // Element remove
        queue.remove();// throws exception
        System.out.println(queue.poll());// safer (return null)

    }
}
// Stack --> LIFO
