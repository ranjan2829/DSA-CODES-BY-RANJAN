import java.util.Scanner;

public class BinaryTrees {
    public BinaryTrees() {
    }

    private static class Node {
        private int data;
        Node left;
        Node right;

        public Node(int val) {
            this.data = val;
        }
    }

    private Node root;

    public void populate(Scanner scanner) {
        System.out.println("enter root");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("wanna enter left child of " + node.data);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("enter the val for left of  " + node.data);
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner, node.left);
        }

        System.out.println("do you wanna enter to the right of  " + node.data);
        boolean right = scanner.nextBoolean();

        if (right) {
            System.out.println("enter the val for right of  " + node.data);
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.data);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
        }
    }

    public static void main(String[] args) {
        BinaryTrees binaryTree = new BinaryTrees();
        Scanner scanner = new Scanner(System.in);
        binaryTree.populate(scanner);
        binaryTree.display();
    }


}
