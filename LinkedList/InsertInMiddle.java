class InsertInMiddle {
    public Node insertInMiddle(Node head, int x) {
        // Code here
        Node newNode = new Node(x);
        if(head == null){
            head = newNode;
            return head;
        }
        if(head.next == null){
            head.next = newNode;
            return head;
        }
        
        Node prev = head;
        Node curr = head;


        while (curr != null && curr.next != null && curr.next.next != null) {
            prev = prev.next;
            curr = curr.next.next;
        }

 

        newNode.next = prev.next;
        prev.next = newNode;
        
        return head;
    }
}
