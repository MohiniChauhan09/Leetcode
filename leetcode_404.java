//  T.C: O(n)
//  S.C: O(1) //No auxillary space
class Solution {
    public int solve(TreeNode curr,TreeNode parent){
        if(curr==null){
            return 0;
        }
        
        //leaf node
        if(curr.left==null && curr.right==null){
            if(parent!=null && parent.left==curr){
                return curr.val;
            }
        }

        int left=solve(curr.left , curr);
        int right=solve(curr.right, curr);

        return left + right;
    }

    public int sumOfLeftLeaves(TreeNode root) {
        return solve(root,null);
        
    }
}
