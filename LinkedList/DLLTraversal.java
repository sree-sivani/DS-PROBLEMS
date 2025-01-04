public static ArrayList<Integer> displayList(Node head)
{
    // your code here
     ArrayList<Integer> result = new ArrayList<>();
     Node currNode = head;
    while(currNode != null) {
        result.add(currNode.data);
        if(currNode.next == null) {
            break;
        }
        currNode = currNode.next;
    }
    while(currNode.next != null) {
        result.add(currNode.data);
        currNode = currNode.prev;
    }
    return result;  
}
