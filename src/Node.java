// ============================================================================
// Class: Node<T>
// ============================================================================
// 
// Attributes:
//		*	<T> value:	Template type containing the value stored in the current node
//		*	Node next:	reference to the next Node in the sequence. Since this
//						Node class is to be used in just a singly-linked list,
//						it only needs a single reference to the next Node in the
//						list
//
// Constructors:
//		*	Default Constructor:
//				Input:	N/A 
//				Output:	N/A 
//				Task:	Leave both attributes unassigned. This allows an empty
//						Node to be treated as a null reference, rather than
//						a node with null values.
//		*	One Parameter
//				Input:	template<T> value to be stored in the Node
//				Output:	N/A
//				Task:	Leave the "next" attribute uninitialized, but store a
//						value within the Node
//
// Accessor Methods:
//		*	getNext
//				Input:	N/A
//				Output:	Returns the current Node's "next" attribute
//				Task:	function to provide access to the private attribute "next"
//		*	getValue
//				Input:	N/A
//				Output:	Returns the current Node's stored template<T> "value" attribute
//				Task:	function to provide access to the private attribute "value"
//
// Mutator Methods:
//		*	setNext
//				Input:	a Node for this Node to reference in the "next" attribute
//				Output:	N/A
//				Task:	modify the value of the private "next" attribute
//		*	setValue
//				Input:	a template<T> value for this node to store in its "value" attribute
//				Output:	N/A
//				Task:	modify the value of the private "value" attribute
//
// Other Methods:
//		N/A
// 
// ============================================================================
public class Node <T>
{
    private T value;
    private Node next;

    public Node(){ /* leaves both attributes unassigned */ }
    public Node(T value)
    {
        this.value = value;
    }

    public T getValue()
    {
        return this.value;
    }
    public void setValue(T value)
    {
        this.value = value;
    }

    public Node getNext()
    {
        return this.next;
    }
    public void setNext(Node next)
    {
        this.next = next;
    }
}
