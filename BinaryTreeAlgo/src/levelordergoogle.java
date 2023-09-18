import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class levelordergoogle {
    public static void main(String[] args) {

    }
    public TreeNode findsuccessor(TreeNode node, int key){
        if(root ==null){
            return null;
        }
        Queue<TreeNode> result=new LinkedList<>();
        result.offer(node);
        while(!result.isEmpty()){
            int size=result.size();
            TreeNode current=result.poll();
            if(current.left!=null){
                result.offer(current.left);
            }
            if(current.right!=null){
                result.offer(current.right);
            }
            if(current.val==key){
                break;
            }



        }
        return result.peek();
    }

}
