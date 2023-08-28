public class BST {
    public class Node{
        private int data;
        private int height;
        private Node left;
        private Node right;

        public Node(int val){
            this.data=val;

        }
        public int getValue(){
            return data;

        }
        private Node root;



    }
    public BST(){

    }
    private Node root;
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;

    }
    public boolean isEmpty(){
        return root==null;
    }
    public void display(Node node , String details){
        if(node==null){
            return;

        }
        System.out.println(details+node.data);
    }



}
