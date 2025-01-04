class DisplayList {
    // Function to display the elements of a linked list in same line
    void printList(Node head) {
        if(head.next == null){
            System.out.print(head.data);
            return;
        }
        
        Node currNode = head;
        
        while(currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
}
