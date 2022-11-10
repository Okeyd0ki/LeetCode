/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root==null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<Integer>();
            int size=q.size();
            for(int i=0; i<size; i++){
                TreeNode t= q.poll();
                if(t.left!=null){
                    q.offer(t.left);
                }
                if(t.right!=null){
                    q.offer(t.right);
                }
                temp.add(t.val);
            }
            ans.add(temp);
        }
        return ans;
    }
}