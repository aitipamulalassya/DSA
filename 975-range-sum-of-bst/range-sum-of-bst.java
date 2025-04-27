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
    int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum=0;
        return helper(root,low,high);
    }
    int helper(TreeNode root,int low,int high) {
        if(root==null){
            return sum;
        }
        sum+=root.val;
        if(root.val<low)
        return rangeSumBST(root.right,low,high);
        if(root.val>high)
        return rangeSumBST(root.left,low,high);
        sum+=rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);
        return sum;
    }
}