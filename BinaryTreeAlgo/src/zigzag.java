import javax.swing.tree.TreeNode;
import java.util.*;

public class zigzag {
    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> result=new ArrayList<>();
            boolean reverse =false;
            if (root ==null){
                return result;
            }
            Deque<TreeNode> nodes=new LinkedList<>();
            nodes.offer(root);
            while(!nodes.isEmpty()){
                int size= nodes.size();
                List<Integer> ans=new ArrayList<>(size);
                for(int i=0;i<size;i++){
                    if(!reverse){
                        TreeNode node = nodes.pollFirst();
                        ans.add(node.val);

                        if(node.left!=null){
                            nodes.addLast(node.left);
                        }
                        if(node.right!=null){
                            nodes.addLast(node.right);
                        }


                    }
                    else{
                        TreeNode node = nodes.pollLast();
                        ans.add(node.val);

                        if(node.right!=null){
                            nodes.addFirst(node.right);
                        }
                        if(node.left!=null){
                            nodes.addFirst(node.left);
                        }

                    }
                    reverse=!reverse;
                    result.add(ans);

                }
                return result;

            }


        }
    }

