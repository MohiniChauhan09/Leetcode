//Simple Recursion 
//T.C : O(n)
//S.C : O(height)
class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root == null) {
            return null;
        }

        root.left  = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        if(root.left == null && root.right == null && root.val == target)
            return null;

        return root;
    }
}
