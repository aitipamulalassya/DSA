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
class FindElements {
    Set<Integer> st;
    public FindElements(TreeNode root) {
   
      st=new HashSet<>();
      dfs(root,0);  
        
          
        

    }
    
    public boolean find(int target) {
      return st.contains(target);
    }
     void dfs(TreeNode curNode,int curval){
        if(curNode==null)return;
        st.add(curval);
        dfs(curNode.left,2 * curval + 1);  
         dfs(curNode.right,2 * curval + 2);  
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */