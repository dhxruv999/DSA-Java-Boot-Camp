class Solution {

    public static void traversal(TreeNode root, List<Integer> ans) {
        // base 
        if(root == null){
            return;
        }
        // logic
        ans.add(root.val);
        traversal(root.left, ans);
        traversal(root.right, ans);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        traversal(root, ans);
        return ans;
    }
}
