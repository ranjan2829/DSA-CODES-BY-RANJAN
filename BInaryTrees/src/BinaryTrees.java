import java.util.Scanner;

public class BinaryTrees {
    public BinaryTrees(){

    }
    private static class Node(){
        private int data;
        Node left;
        Node right;
        public Node(int val){
            this.data=val;
        }
    }
    private Node root;
    //insert
    public void populate(Scanner scanner){
        System.out.println("enter root");
        int value=scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);
    }
    private void populate(Scanner scanner,Node node){
        System.out.println("wanna enter left child of "+node.data);
        boolean left= scanner.nextBoolean();
        if(left){
            System.out.println("enter the val for left of  "+node.data);
            int val=scanner.nextInt();
            node.data=val;
            populate(scanner,node.left);
        }


        boolean right= scanner.nextBoolean();
        if(right){
            System.out.println("enter the val for right of  "+node.data);
            int val=scanner.nextInt();
            node.data=val;
            populate(scanner,node.left);
        }


    }
}
