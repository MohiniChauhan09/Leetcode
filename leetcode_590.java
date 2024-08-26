// T.C: O(n)
// S.C: O(n)
class Solution {
    public void dfs(Node root, List<Integer> ans){
        if(root == null) return;
        for(Node child: root.children){
            dfs(child,ans);
        }
        ans.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        List<Integer> ans= new ArrayList<>();
        dfs(root,ans);
        return ans;
    }
}
