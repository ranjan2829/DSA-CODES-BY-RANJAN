import javax.swing.tree.TreeNode;

class Solution {
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        height(root);
        return diameter(root);

    }
    public int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftHeight=height(node.left);
        int rightHeight=height(node.right);
        int dia=leftHeight=rightHeight+1;
        diameter=Math.max(diameter,dia);

        return Math.max(leftHeight,rightHeight)+1;


    }
}