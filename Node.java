
/**
 * @author jonat
 * This class represents a generic Node in a LinkedList.
 * @param <T> The type of data that this node holds.
 */
class Node<T> {
    T data;
    Node<T> nextNode;

    /**
     * Constructor for Node.
     */
    public Node() {
        nextNode = null;
        data = null;
    }

    /**
     * Sets the data held by this Node.
     * @param data The data to be stored in the Node.
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Gets this Node.
     * @return This Node.
     */
    public Node<T> getNode() {
        return this;
    }

    /**
     * Sets the next node of this Node.
     * @param nextNode The Node that follows this Node.
     */
    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}