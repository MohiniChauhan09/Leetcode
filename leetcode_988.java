//Approach-1 (Using DFS)
//T.C : O(n)
//S.C : O(n) space taken for resurion system stack
class Solution {
    String result = "";

    void solve(TreeNode root, String curr) {
        if (root == null) {
            return;
        }

        curr = (char) (root.val + 'a') + curr; // This will take O(length of curr) but I have ignored this. You can consider this as well in calculating T.C

        if (root.left == null && root.right == null) {
            if (result.equals("") || result.compareTo(curr) > 0) {
                result = curr;
            }
            return;
        }

        solve(root.left, curr);
        solve(root.right, curr);
    }

    public String smallestFromLeaf(TreeNode root) {
        solve(root, "");
        return result;
    }
}
