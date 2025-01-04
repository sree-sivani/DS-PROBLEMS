class ModularNode {
    public int modularNode(Node head, int k) {
        // Code here//Position this line where user code will be pasted.
        Node curr = head;
        int val = 1;
        int idx = -1;
        while(curr != null){
            
            if(val % k == 0){
                idx = curr.data;
            }
            val++;
            curr = curr.next;
            
        }
        
        return idx;
        
    }
}
