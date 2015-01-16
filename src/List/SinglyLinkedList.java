package List;

public class SinglyLinkedList {

    private Node head;
    private Node tail;

    public static void main(String[] args)
    {
        int[] numbers = {1};//,4,90,3,67,22,34};
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insert(numbers);
        singlyLinkedList.display();
    }

    /*
    This method inserts elements into the linked list given an array of numbers
     */
    protected void insert(int[] numbers)
    {
        if(numbers.length > 1)
        {
            for(int i = 0; i < numbers.length; i++)
            {
                if( i == 0)
                {
                    head = new Node(numbers[i]);
                    tail = head;
                }
                else
                {
                    Node newNode = new Node(numbers[i]);
                    tail.setNextNode(newNode);
                    tail = newNode;
                }
            }
            tail.setNextNode(null);
        }
        else if (numbers.length == 1)
        {head = new Node(numbers[0]);
        head.setNextNode(null);
        tail = head;           }
    }

    /*
    This method displays
     */
    protected void display()
    {
        Node currentNode = head;
        while(currentNode != null)
        {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNextNode();
        }
    }

    protected Node getHead()
    {
        return this.head;
    }
}
