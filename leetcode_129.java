// T.C: O(n)
// S.C: O(1)
class Solution {
    public int solve(TreeNode root,int curr){
        if(root==null){
            return 0;
        }
        curr= curr * 10 + root.val ;
        if(root.left==null && root.right==null){
            return curr;
        }

        int left=solve(root.left,curr);
        int right=solve(root.right,curr);

        return left+right;
    }
    public int sumNumbers(TreeNode root) {
        return solve(root,0);
        
    }
}
