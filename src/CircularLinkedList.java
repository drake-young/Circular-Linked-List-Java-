// ============================================================================
// Class: CircularLinkedList<T>
// ============================================================================
// 
// Attributes:
//		*	int length:	integer containing quantity of Nodes in the list (excluding the head)
//		*	Node head:	Node to serve as a reference to the first Node in the list. Stores no
//						value, and only interacts with the "next" attribute.
//
// Constructors:
//		*	Default Constructor:
//				Input:	N/A 
//				Output:	N/A 
//				Task:	Initialize head using the Node class's default constructor
//						Initialize length with a value of 0
//
// Accessor Methods:
//		*	getFirstNode
//				Input:	N/A
//				Output:	Returns the node that the head attribute references
//				Task:	Instead of allowing access to the head, the first element in the list
//						is returned instead
//		*	getLength
//				Input:	N/A
//				Output:	Returns the value stored in the "length" attribute (current number of nodes in the list)
//				Task:	function to provide access to the private attribute "length"
//
// Mutator Methods:
//		N/A
//
// Other Methods:
//		*	insertFront
//				Input:	template<T> value to be stored in a node that is appended
//						to the front of the list
//				Output: N/A
//				Task:	
//					- 	Create a new node containing the passed parameter
//					- 	set the new node's reference to the current first node
//					- 	change the head's reference to the new node
//					- 	iterate to the end of the list, and change the last element's
//						reference to the new node
//					-	increment length
//		*	insertBack
//				Input:	template<T> value to be stored in a node that is appended
//						to the back of the list
//				Output:	N/A
//				Task:
//					-	create a new node containing the passed parameter
//					-	iterate to the end of the list
//					-	change the final element's "next" node to the new node
//					-	change the new node's "next" node to the first (referenced by head)
//					-	increment length
//		*	insertAt
//				Input: 	- Integer value containing the position in the list to insert at (0-based indexing)
//						- template<T> value containing the value to be added at that position
//				Output:	N/A
//				Task:
//					-	if position or this.length is 0, call insertFront and return
//					-	if position is this.length, call insertBack and return
//					-	create new node containing passed value
//					-	iterate to the position in the list prior to insert
//					-	set the new node's "next" to the "next" of the previous position
//					-	set the "next" of the node in the previous position to the new node
//					-	increment length
//		*	shiftRight
//				Input:	N/A
//				Output: N/A
//				Task:	set the reference of this.head to the last element of the list
//		*	shiftLeft
//				Input:	N/A
//				Output:	N/A
//				Task:	set the reference of this.head to the next element in the list
//		*	printList
//				Input:	N/A
//				Output:	Prints to the console
//				Task:	iterates through the list, printing every value in the 
//						form val1 > val2 > ... > valN
//
// Additional Notes:
//      *   The assignment never specified the need to implement deletion/removal
//          from the list, so none was added
//
// ============================================================================
public class CircularLinkedList <T>
{
    private Node head; // references the start of the list
    private int length;

    public CircularLinkedList()
    {
        head = new Node();
        length = 0;
    }

    public Node getFirstNode()
    {
        return this.head.getNext();
    }
    public int getLength()
    {
        return this.length;
    }

    public void insertFront(T x)
    {
        Node node = new Node(x);
        node.setNext(this.head.getNext());
        this.length += 1;

        if (this.length == 1)
        {
            node.setNext(node);
        }
        else
        {
            Node temp = this.head.getNext();
            while (temp.getNext() != this.head.getNext())
            {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }

        this.head.setNext(node);
    }
    public void insertBack(T x)
    {
        Node node = new Node(x);
        node.setNext(this.head.getNext());
        this.length += 1;

        if (this.length == 1)
        {
            this.head.setNext(node);
        }
        else
        {
            Node temp = this.head.getNext();
            while (temp.getNext() != head.getNext())
            {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }
    public void insertAt(int position, T value)
    {
        if (this.length==0 || position==0)
        {
            insertFront(value);
            return;
        }
        if (position == this.length)
        {
            insertBack(value);
            return;
        }

        this.length += 1;
        Node insert = new Node(value);
        Node prev = this.head.getNext();
        for(int i = 1; i < (position%this.length); ++i)
        {
            prev = prev.getNext();
        }
        insert.setNext(prev.getNext());
        prev.setNext(insert);
    }

    public void shiftRight()
    {
        Node temp = this.head.getNext();
        while (temp.getNext() != this.head.getNext())
        {
            temp = temp.getNext();
        }
        head.setNext(temp);
    }
    public void shiftLeft()
    {
        this.head.setNext(this.head.getNext().getNext());
    }

    public void printList()
    {
		if(this.length == 0)
		{
			return;
		}
        Node temp = this.head.getNext();
        while(temp.getNext() != this.head.getNext()) {
            System.out.print(temp.getValue());
            if (temp.getNext() != this.head.getNext())
            {
                System.out.print(" > ");
            }
            temp = temp.getNext();
        }
        System.out.print(temp.getValue());
        System.out.printf("%n");
    }
}
