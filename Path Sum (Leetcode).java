class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // base condition 
        if(root == null){
            return false;
        }
        // base conditions
        if(root.left == null && root.right == null) {
            return targetSum - root.val == 0;
        }
        // logic 
        targetSum = targetSum - root.val;
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right,targetSum);
    }
}
