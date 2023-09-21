import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        Queue<TreeNode> nodes=new LinkedList<>();
        nodes.offer(root);
        while(!nodes.isEmpty()){
            int size= nodes.size();
            List<Integer> ans=new ArrayList<>(size);
            for(int i=0;i<size;i++){
                TreeNode current=nodes.poll();
                ans.add(current.val);

            }
            if(nodes.left!=null){
                nodes.offer(root.left);
            }
            if(root.right!=null){
                nodes.offer(root.right);

            }
        }


    }
}