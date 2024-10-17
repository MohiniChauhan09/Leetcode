// T.C: O(3n) ~ O(n)
// S.C: O(n) -> Recursive stack space
class Solution {
    public TreeNode construct(int[] preorder, int bound, int[] index){
        if(index[0] == preorder.length || preorder[index[0]] > bound) return null;
        TreeNode root= new TreeNode(preorder[ index[0]++ ]);
        root.left= construct(preorder, root.val, index);
        root.right= construct(preorder, bound, index);
        return root;
    }  
    public TreeNode bstFromPreorder(int[] preorder) {
        int[] i= new int[1];
        return construct(preorder, Integer.MAX_VALUE, i);
    }
}
