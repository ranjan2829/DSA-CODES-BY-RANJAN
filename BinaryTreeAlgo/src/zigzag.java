import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class zigzag {
    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> result=new ArrayList<>();
            if (root ==null){
                return result;
            }
            Queue<TreeNode> nodes=new LinkedList<>();
            nodes.offer(root);
            while(!nodes.isEmpty()){
                int size= nodes.size();
                for(int i=0i<size;i++){

                }

            }


        }
    }
}
