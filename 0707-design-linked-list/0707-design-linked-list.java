class MyLinkedList {
    class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    Node head;
    Node tail;
    int num;

    public MyLinkedList() {
        head=null;
        tail=null;
        num=0;
    }
    
    public int get(int index) {
        if(index<0 ||index>=num||head==null){
            return -1;
        }else{
            Node temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            return temp.val;
        } 
    }
    
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        if(head==null){
            head=tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
        num++;
    }
    
    public void addAtTail(int val) {
        Node newtail=new Node(val);
        if(tail==null){
            head=tail=newtail;
        }else{
            tail.next=newtail;
            tail=newtail;
        }
        num++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0||index>num){
            return;
        }
        if(index==0){
            addAtHead(val);
        }else if(index==num){
            addAtTail(val);
        }else{
            Node nd=new Node(val);
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            nd.next=temp.next;
            temp.next=nd;
            num++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index<0||index>=num||head==null){
            return;
        }else if(head==tail){
            head=null;
            tail=null;
            num--;
        }else if(index==0){
            head=head.next;
            num--;
        }else if(index==num-1){
            Node temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
            num--;
        }else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            num--;
        }
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