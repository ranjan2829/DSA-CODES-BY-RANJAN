public class DLL {
    Node head;
    public void insertFirst(int val){
        Node node= new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;


    }
    private class Node{
        int val;
        Node prev;
        Node next;

        public Node(int val){
            this.val=val;

        }
        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }

    }
}
