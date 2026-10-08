/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
        
        if(head==null){
            return false;
        }
        
        else if(head.data==key){
            return true;
        }
        
        return searchKey(head.next,key);
        
    }
}