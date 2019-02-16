// ============================================================================
// Class: Problem3_java
// ============================================================================
//
// ** Class that exists solely to contain main() **
//
// method main()
//		Input:	String args[]
//		Output:	N/A
//		Task:
//			Act as the main driver for the program, showcasing the functionality
//			of the CircularLinkedList class by inserting various int values using
//			its three insert functions, printing the list, and showing working 
//			shift functions. Additionally, it shows the type-generality of the
//			CircularLinkedList class by creating both an integer one and a
//			character one, as well as a mixed-type one.
//
// ============================================================================
public class Problem3_java
{
    public static void main(String args[])
    {
        CircularLinkedList myList = new CircularLinkedList();
        myList.insertFront(10);
        myList.insertFront(5);
        myList.insertFront(20);
        myList.insertBack(30);
        myList.insertFront(1);
        myList.insertAt(2,3);

        System.out.println("Integer List:");
        myList.printList();

        System.out.println("Shifting Right");
        myList.shiftRight();
        myList.printList();

        System.out.println("Shifting Left (from original)");
        myList.shiftLeft();
        myList.shiftLeft();
        myList.printList();


        System.out.println("Character List");
        CircularLinkedList myListChar = new CircularLinkedList();
        myListChar.insertFront('E');
        myListChar.insertFront('D');
        myListChar.insertFront('B');
        myListChar.insertBack('F');
        myListChar.insertFront('A');
        myListChar.insertAt(2,'C');
        myListChar.printList();
        System.out.println("Right Shift");
        myListChar.shiftRight();
        myListChar.printList();
        System.out.println("Left Shift (from original)");
        myListChar.shiftLeft();
        myListChar.shiftLeft();
        myListChar.printList();

        System.out.println("Mixed Type");
        CircularLinkedList mixedList = new CircularLinkedList();
        mixedList.insertFront('A');
        mixedList.insertFront(10);
        mixedList.insertFront("String");
        mixedList.insertBack(3.14);
        mixedList.insertFront(123456789L);
        mixedList.insertAt(2,'X');
        mixedList.printList();
        System.out.println("Right Shift");
        mixedList.shiftRight();
        mixedList.printList();
        System.out.println("Shift Left (from original)");
        mixedList.shiftLeft();
        mixedList.shiftLeft();
        mixedList.printList();
    }
}
