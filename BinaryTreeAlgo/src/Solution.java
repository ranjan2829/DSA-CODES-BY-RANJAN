import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> nodes=new LinkedList<>();
        nodes.offer(root);
        while(!nodes.isEmpty()){
            int size = nodes.size();
            TreeNode node= nodes.poll();
            List<Integer> temp=new ArrayList<>(size);
            for(int i=0;i<size;i++){
                int sum+=node.val;
                Double z=sum/size;
                temp.add(z);

            }
            if(node.left!=null){
                nodes.offer(node.left);
            }
            if(node.right!=null){
                nodes.offer(node.right);
            }
            result.add(temp);

        }
        return result;



        
        
    }
}