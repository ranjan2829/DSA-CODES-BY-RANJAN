public class CLL {
    private Node head;
    private Node tail;
    public CLL(){
        this.head=null;
        this.tail=null;
    }
    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

}
