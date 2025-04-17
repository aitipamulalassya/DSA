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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> li=new ArrayList<>();
        if(root==null)
        return li ;
        Queue<TreeNode> q=new LinkedList<>();
        
        q.add(root);
        int lvl=0;
        while(!q.isEmpty()){
            int size=q.size();
            lvl++;
            List<Integer> sli=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode fr=q.poll();
                sli.add(fr.val);
                if(fr.left!=null)
                q.add(fr.left);
                if(fr.right!=null)
                q.add(fr.right);

            }
            if(lvl%2!=0)
            li.add(sli);
            else{
                Collections.reverse(sli);

                li.add(sli);
            }
        }
        return li;
    }
}