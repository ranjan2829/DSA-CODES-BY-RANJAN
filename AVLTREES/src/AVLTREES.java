class AVLTREES {
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
        public AVLTREES(){

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
            return rotate(node);

        }
        private Node rotate(Node node){
            if(height(node.left)-height(node.right)>1)
            //left heavy
            {
                if (height(node.left.left) - height(node.left.right) > 0) {
                    //leftleft
                    return rightrotate(node);
                }
                if (height(node.left.left) - height(node.left.right) < 0) {
                    node.left = leftrotate(node.left);
                    return rightrotate(node);


                }
            }
            if(height(node.left)-height(node.right)>-1)
                //right heavy
            {
                if (height(node.right.left) - height(node.right.right) < 0) {
                    //leftleft
                    return leftrotate(node);
                }
                if (height(node.right.left) - height(node.right.right) < 0) {
                    node.right = rightrotate(node.right);
                    return lefttrotate(node);


                }
            }
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
        public void preorder(){
            preorder(root);
        }
        private void preorder(Node node){
            if(node==null){
                return;
            }
            System.out.println(node.data+ " ");
            preorder(node.left);
            preorder(node.right);

        }



}


