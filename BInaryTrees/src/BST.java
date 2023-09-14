public abstract class BST {
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

        display(node.left,"Left child of "+node.getValue()+":");
        display(node.right,"right child of "+node.getValue()+":");
    }
    private Node insert(int val,Node node){
        if(node==null){
            node=new Node(val);
            return node;
        }
        if(val< node.data){
            node.left=insert(val,node.left);
        }
        if(val>node.data){
            node.right=insert(val,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;

    }
    public boolean balacned(){
            return balanced(root);
}
    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 &&balanced(node.left)&&balanced(node.right);
    }



}
