//T.C : O(n)
//S.C : O(height of tree due to recursion)
class Solution
{
    public static int distributeCoins(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }

        int[] moves = {0};
        solve(root, moves);

        return moves[0];
    }
    private static int solve(TreeNode root, int[] moves) {
        if (root == null) {
            return 0;
        }

        int l = solve(root.left, moves);
        int r = solve(root.right, moves);

        int totalExtraCandies = (l + r + root.val) - 1;

        moves[0] += Math.abs(l) + Math.abs(r);

        return totalExtraCandies;
    }
}
