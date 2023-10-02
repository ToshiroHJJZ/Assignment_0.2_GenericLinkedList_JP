/** 
 * A class that applies a node to a linked list. 
 * @author jonat 
*/
public class Application {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();

        Node<Integer> aNode = new Node<>();
        aNode.setData(1);
        myList.addNode(aNode);
        
        aNode = new Node<>();
        aNode.setData(2);
        myList.addNode(aNode);

        Node<Integer> tempnode = myList.getList();
        
        do {
            System.out.println(tempnode.data);
            tempnode = tempnode.nextNode;
        } while (tempnode != null);
    }
}