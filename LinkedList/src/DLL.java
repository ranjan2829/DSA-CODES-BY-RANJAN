public class DLL {
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
