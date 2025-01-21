/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if the root is null, or the root is either p or q, return the root
        if (root == null || root == p || root == q) {
            return root;
        }
        
        // Recur for the left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        // If both left and right are non-null, root is the LCA
        if (left != null && right != null) {
            return root;
        }
        
        // Otherwise, return the non-null child (if both are null, this will return null)
        return left != null ? left : right;
    }
}