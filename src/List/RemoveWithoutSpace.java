package List;

public class RemoveWithoutSpace {

    private Node head;
    private static SinglyLinkedList linkedList;

    public static void main(String[] args) {

        linkedList = new SinglyLinkedList();
        int[] num = {2,56,56,57,2,4, 4 , 5};//,23, 45, 23, 89, 90, 2};
        linkedList.insert(num);
        RemoveWithoutSpace removeWithoutSpace = new RemoveWithoutSpace();
        removeWithoutSpace.removeDuplicatesFromList();
        linkedList.display();


    }

    protected void removeDuplicatesFromList()
    {
        Node currentNode;
        head = linkedList.getHead();
        currentNode = head;

        while (currentNode != null)
        {
            Node previous = currentNode;
           while (previous.getNextNode() != null)
           {
               if(currentNode.getValue() == previous.getNextNode().getValue())
               {
                    previous.setNextNode(previous.getNextNode().getNextNode());
               }
               else
               {
                   previous = previous.getNextNode();
               }
           }
            currentNode = currentNode.getNextNode();
        }
    }
}
