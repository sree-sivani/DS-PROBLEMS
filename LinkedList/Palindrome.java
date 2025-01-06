/* Structure of class Node is
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Palindrome {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
        
        if(head.next == null || head == null){
            return true;
        }
        Node firstHead = head;
        
        Node middle = getMiddle(head);
        Node secondHead = reverse(middle.next);
        
        while(secondHead != null){
            if(firstHead.data != secondHead.data){
                return false;
            }
            firstHead = firstHead.next;
            secondHead = secondHead.next;
        }
        
        return true;
    }
    
    public Node getMiddle(Node head){
        Node fast = head;
        Node slow = head;
        
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow;
    }
    
    public Node reverse(Node head){
        Node currNode = head;
        Node prevNode = null;
        
        while(currNode != null){
            Node nextNode = currNode.next; // Store next node
            currNode.next = prevNode; // Reverse the link
            prevNode = currNode; // Move previous node forward
            currNode = nextNode;
        }
        
        
        return prevNode;
    }
}
