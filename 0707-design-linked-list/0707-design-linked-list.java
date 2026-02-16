class MyLinkedList {

    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    public MyLinkedList() {
        this.head = null;
        this.tail= null;
    }
    
    public int get(int index) {
        Node temp = head;
        int i =0;
        while(i<index && temp !=null){
            temp = temp.next;
            i++;
        }
      return temp!=null? temp.val:-1;
    }
    
    public void addAtHead(int val) {
        if(head==null){
            Node newNode = new Node(val);
            head = tail = newNode;
            return;
        }
        Node newNode = new Node(val);
        newNode.next = head;
        head=newNode;
        return;
    }
    
    public void addAtTail(int val) {
        if(tail == null){
            Node newNode = new Node(val);
            tail = head = newNode;
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail= newNode;
        return;
    }
    
    public void addAtIndex(int index, int val) {
        if(index ==0){
            addAtHead(val);
            return;
        }
        int i =0;
        Node temp = head;
        while(i<index-1 && temp !=null){
            temp = temp.next;
            i++;
        }
        if(temp ==null){
            return;
        }
        if(temp.next == null){
            addAtTail(val);
            return;
        }
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        return;
    }
    
    public void deleteAtIndex(int index) {
        if(index==0 && head!=null){
            head = head.next;
            if(head==null){
                tail = null;
            }
            return;
        }
        int i =0;
        Node temp = head;
        while(i<index-1 && temp!=null){
            temp = temp.next;
            i++;
        }
        if(temp==null || temp.next ==null){
            return;
        }
        if(temp.next == tail){
            tail = temp;
        }
        temp.next = temp.next.next;
        return;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */