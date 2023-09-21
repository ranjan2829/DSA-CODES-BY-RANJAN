public class pathcheck {
    public boolean path(TreeNode root,int[] arr){
        if(root==null){
            return arr.length==0;
        }
        return helper(root,arr,0);

    }
    boolean helper(Node node,int[] arr,int index){
        if(node==null){
            return false;
        }
        if(node.left==null&&ode.right==null&&index=arr.length-1){
            return true;
        }
        return helper(node.left,arr,index+1)||helper(node.right,arr,index+1);


    }
}
