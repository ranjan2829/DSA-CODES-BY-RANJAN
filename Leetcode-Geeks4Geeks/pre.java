import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans
        }
        Queue<Nodes> nodes=new LinkedList<>();
        nodes.offer(root);
        while(!nodes.isEmpty()){
            int size=nodes.size;
            Node curr=nodes.get();
            ans.add(curr.val);
            if(curr.left!=null){
                nodes.offer(curr.left);
            }
            if(curr.right!=null){
                nodes.offer(curr.right);
            }

            


        }
        return ans;
        
    }
}