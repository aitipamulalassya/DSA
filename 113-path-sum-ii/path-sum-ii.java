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
    List<List<Integer>> oli=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer>li =new ArrayList<>();
        helper(root,li,0,targetSum);
        return oli;
    }
   void helper(TreeNode root,List<Integer> li,int sum,int tsum){
   
        if(root==null){
            
            return;
        }
         li.add(root.val);
         sum+=root.val;
         
       if(root.left==null&&root.right==null&&tsum==sum){
        oli.add(new ArrayList<>(li));
       }

        helper(root.left,li,sum,tsum);
        helper(root.right,li,sum,tsum);
li.remove(li.size()-1);
return;
    }
}