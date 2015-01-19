package List;

import java.util.ArrayList;
import java.util.List;

public class FindNToLast {

    private List<Node> nodeList = new ArrayList<Node>();
    public static void main(String[] args) {

        int[] numbers = {2,3,4,6,7,9};
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insert(numbers);
        Node head = linkedList.getHead();
        FindNToLast findNToLast = new FindNToLast();
        findNToLast.getNodes(head,3);

    }

    protected List<Node>  getNodes(Node head, int n)
    {
        Node currentNode = head;
        int counter = 0 ;
        while(currentNode != null)
        {
            if(counter == n)
            {
                nodeList.add(currentNode);
                currentNode = currentNode.getNextNode();
            }
            else
            {
                counter += 1;
                currentNode = currentNode.getNextNode();

            }
        }
        return nodeList;
    }
}
