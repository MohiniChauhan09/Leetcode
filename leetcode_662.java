// T.C: O(n)
// S.C: O(n)
class Solution{
    public class Pair{
        TreeNode node; long idx;
        public Pair(TreeNode node, long idx){
            this.node= node;
            this.idx=idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Deque<Pair> q= new LinkedList<>();
        long maxWidth=0;
        q.add(new Pair(root, 0));
        while(!q.isEmpty()){
            long r= q.getLast().idx;
            long l= q.getFirst().idx;
            maxWidth= Math.max(maxWidth, r-l+1);
            int size= q.size();  
            for(int i=0; i<size; i++){
                Pair curr= q.poll();
                if(curr.node.left != null) q.add( new Pair(curr.node.left, curr.idx*2+1 ));
                if(curr.node.right != null) q.add( new Pair(curr.node.right, curr.idx*2+2));
            }
        }
        return (int)maxWidth;
    }
}
