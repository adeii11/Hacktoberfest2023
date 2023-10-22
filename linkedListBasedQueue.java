import java.util.LinkedList;

class LinkedQueue<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Enqueue operation to add an element to the end of the queue
    public void enqueue(T item) {
        list.addLast(item);
    }

    // Dequeue operation to remove and return the front element from the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.removeFirst();
    }

    // Peek operation to return the front element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.getFirst();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return list.size();
    }
}

// Example usage
public class QueueExample {
    public static void main(String[] args) {
        LinkedQueue<String> queue = new LinkedQueue<>();

        queue.enqueue("One");
        queue.enqueue("Two");
        queue.enqueue("Three");

        System.out.println("Front element: " + queue.peek()); // Output: One

        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
    }
}
