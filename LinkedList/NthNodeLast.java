import java.util.Scanner; // Import Scanner class for user input

// Class representing a Singly Linked List
class LL {
    private int size; // Variable to track the size of the linked list
    Node head; // Head node of the linked list

    // Constructor initializes size to 0
    LL() {
        size = 0;
    }

    // Inner class representing a Node in the linked list
    class Node {
        String data; // Stores data for the node
        Node next; // Points to the next node in the list

        // Constructor initializes node with given data and sets next to null
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a new node at the beginning of the linked list
    public void addFirst(String data) {
        Node newNode = new Node(data); // Create a new node with given data
        if (head == null) { // If the list is empty, set head to new node
            head = newNode;
            size++;
            return;
        }

        newNode.next = head; // Point new node's next to the current head
        head = newNode; // Update head to new node
        size++; // Increment size
    }

    // Method to add a new node at the end of the linked list
    public void addLast(String data) {
        Node newNode = new Node(data); // Create a new node with given data
        if (head == null) { // If the list is empty, set head to new node
            head = newNode;
            size++;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) { // Traverse to the last node
            currNode = currNode.next;
        }

        currNode.next = newNode; // Link last node to new node
        size++; // Increment size
    }

    // Method to display all elements in the linked list
    public void displayList() {
        if (head == null) { // Check if list is empty
            System.out.println("EMPTY LIST");
            return;
        }
        Node currNode = head;
        while (currNode != null) { // Traverse through the list and print elements
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL"); // End of list
    }

    // Method to delete the first node of the linked list
    public void deleteFirst() {
        if (head == null) { // If list is empty, print message
            System.out.println("EMPTY LIST");
            return;
        }

        head = head.next; // Move head to the next node
        size--; // Decrease size
    }

    // Method to delete the last node of the linked list
    public void deleteLast() {
        if (head == null) { // If list is empty, print message
            System.out.println("EMPTY LIST");
            return;
        }

        Node currNode = head;
        Node prevNode = currNode;

        while (currNode.next != null) { // Traverse to the last node
            prevNode = currNode;
            currNode = currNode.next;
        }

        prevNode.next = null; // Remove last node by setting second last node's next to null
        size--; // Decrease size
    }

    // Method to return the size of the linked list
    public int getSize() {
        return size;
    }

    // Method to delete the nth node from the end of the linked list
    public void nLastNodeDel(int n) {
        if (head == null) { // If list is empty, print message
            System.out.println("EMPTY LIST");
            return;
        }

        int size = getSize(); // Get the current size of the list
        int val = size - n; // Determine position from the start

        Node currNode = head;
        Node prevNode = head;

        while (val > 0) { // Traverse to the (size-n)th node
            prevNode = currNode;
            currNode = currNode.next;
            val--;
        }

        System.out.println();
        System.out.println("Deleting the Node which has the value : " + currNode.data);
        System.out.println();

        prevNode.next = currNode.next; // Remove the nth node from the end
        size--; // Decrease size
    }
}

// Main class to test linked list functionalities
public class NthNodeLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input
        LL l = new LL(); // Create a linked list instance

        // Adding elements to the linked list
        l.addFirst("DEF");
        l.addFirst("ABC");

        l.addLast("GHI");
        l.addLast("JKL");

        // Display the list
        l.displayList();
        System.out.println();

        // Taking user input for nth node deletion
        System.out.println("Enter the n value from last you want to delete: ");
        int n = sc.nextInt();

        // Deleting the nth node from the end and displaying updated list
        l.nLastNodeDel(n);
        l.displayList();
        System.out.println();
    }
}
