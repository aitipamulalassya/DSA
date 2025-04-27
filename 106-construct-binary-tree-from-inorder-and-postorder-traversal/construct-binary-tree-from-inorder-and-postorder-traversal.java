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
    int postin;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       Map<Integer,Integer> mp=new HashMap<>();
       for(int i=0;i<inorder.length;i++){
        mp.put(inorder[i],i);
       } 
    
       int n=postorder.length-1;
        postin=n;
       return helper(mp,postorder,0,inorder.length-1);
    }
   TreeNode helper(Map<Integer,Integer> mp,int[] po,int inst,int inend){
        if(inst>inend){
return null;
        }
        TreeNode root=new TreeNode(po[postin--]);
        int rootin=mp.get(root.val);
        root.right=helper(mp,po,rootin+1,inend);
        root.left=helper(mp,po,inst,rootin-1);
        return root;
    }
}