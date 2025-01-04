class IdenticalLinkedList {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        
        if( head == null ){
            return 0;
        }
        
        if( head.next == null ){
            return 1;
        }
        int size = 0;
        
        
        Node currNode = head;
        
        while( currNode != null ){
            currNode = currNode.next;
            size++;
        }
        return size;
    }
}
