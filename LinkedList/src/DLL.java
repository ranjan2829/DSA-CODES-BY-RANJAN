public class DLL {
    Node head;
    public void insertfirst(int val){
        Node node= new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;


    }
    public void display(){
        Node node=head;
        while(node!=null){
            System.out.print(node.val+" -> ");
            node=node.next;
        }
        System.out.println("END");
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
