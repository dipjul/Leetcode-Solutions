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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == null)
            return null;
        if(original == target)
            return cloned;
        TreeNode result1 = getTargetCopy(original.left, cloned.left, target);
        if(result1 != null)
            return result1;
        TreeNode result2 = getTargetCopy(original.right, cloned.right, target);
        if(result2 != null)
            return result2;
        return null;
    }
}