package List;

public class Node {

    private int value;
    private Node nextNode;

    public Node(int nodeData)
    {
        this.value   = nodeData;
    }

    protected int getValue()
    {
        return value;
    }
    protected void setValue(int value)
    {
        this.value = value;
    }
    protected void setNextNode(Node next)
    {
        this.nextNode = next;
    }


    protected Node getNextNode()
    {
        return nextNode;
    }
}
