import java.util.LinkedList;

class LinkedStack<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Push operation to add an element to the top of the stack
    public void push(T item) {
        list.addFirst(item);
    }

    // Pop operation to remove and return the top element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeFirst();
    }

    // Peek operation to return the top element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getFirst();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Get the size of the stack
    public int size() {
        return list.size();
    }
}

// Example usage
public class StackExample {
    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.peek()); // Output: 3

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}
