
/**
 * @author jonat
 * This class represents a LinkedList.
 * @param <T> The type of data that the LinkedList holds.
 */
public class LinkedList<T> {
    Node<T> head;
    int length;
    Node<T> tail;

    /**
     * Constructor for LinkedList.
     */
    public LinkedList() {
        head = null;
        length = 0;
        tail = head;
    }

    /**
     * Checks if the LinkedList is empty.
     * @return True if the LinkedList is empty, false otherwise.
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Gets the head of the LinkedList.
     * @return The head of the LinkedList.
     */
    public Node<T> getList() {
        return head;
    }

    /**
     * Adds a node to the LinkedList.
     * @param aNode The node to be added to the LinkedList.
     */
    public void addNode(Node<T> aNode) {
        if (isEmpty()) {
            head = aNode;
            tail = head;
            return;
        }
        tail.nextNode = aNode;
        tail = tail.nextNode;
        tail.nextNode = null;
        length++;
    }
}