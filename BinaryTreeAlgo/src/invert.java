import javax.swing.tree.TreeNode;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode left=invertTree(node.left);
        TreeNode right=invertTree(node.right);
        root.left=right;
        root.right=left;
        return root;

    }
}