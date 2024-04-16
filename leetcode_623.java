class Solution {
    public TreeNode answer(TreeNode root, int val,int depth,int curr){
        if(root==null){
            return null;
        }

        if(curr==depth-1){
            TreeNode tempLeft=root.left;
            TreeNode tempRight=root.right;
            root.left=new TreeNode(val);
            root.right=new TreeNode(val);
            root.left.left=tempLeft;
            root.right.right=tempRight;

            return root;
        }

        root.left= answer(root.left,val,depth,curr+1);
        root.right=answer(root.right,val,depth,curr+1);

        return root;
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode newRoot=new TreeNode(val);
            newRoot.left=root;
            return newRoot;
        }

        int curr=1;
        TreeNode ansRoot=answer(root,val,depth,curr);
        return ansRoot;
    }
}
