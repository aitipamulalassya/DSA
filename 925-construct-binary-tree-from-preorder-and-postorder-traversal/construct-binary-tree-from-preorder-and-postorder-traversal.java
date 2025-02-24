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
    private int preInd= 0;
    private int posInd= 0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        
        return constructBST(preorder,postorder);
    }
    public TreeNode constructBST(int[] preorder,int[] postorder){
      
    TreeNode root=new TreeNode(preorder[preInd++]);
    if(root.val!=postorder[posInd])
        root.left=constructBST(preorder,postorder);
        if(root.val!=postorder[posInd])
        root.right=constructBST(preorder,postorder);
        posInd++;
        return root;

    }
}