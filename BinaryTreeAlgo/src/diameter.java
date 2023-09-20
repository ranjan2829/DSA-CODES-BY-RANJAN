import javax.swing.tree.TreeNode;

class Solution {
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


    }
}