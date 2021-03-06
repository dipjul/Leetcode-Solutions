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
    int postIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length-1;
        Map<Integer, Integer> inMap = new HashMap<>();
        for(int i = 0; i < inorder.length; i++)
            inMap.put(inorder[i], i);
        return helper(postorder, 0, inorder.length-1, inMap);
    }
    
    private TreeNode helper(int[] post, int inS, int inE, Map<Integer, Integer> inMap) {
        if(inS > inE) return null;
        
        TreeNode root = new TreeNode(post[postIndex--]);
        root.right = helper(post, inMap.get(root.val)+1, inE, inMap);
        root.left = helper(post, inS, inMap.get(root.val)-1, inMap);

        return root;
    }
}
/*
class Solution {
    int postIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
    	Map<Integer, Integer> mp = new HashMap<>();
		postIndex = postorder.length-1;
		for(int i = 0; i < inorder.length; i++) {
			mp.put(inorder[i], i);
		}
		return helper(postorder, inorder, 0, inorder.length-1, mp);
	}
	
	TreeNode helper(int[] post, int[] in, int inS, int inE, Map<Integer, Integer> mp) {
		if(inS > inE)
			return null;
		TreeNode root = new TreeNode(post[postIndex--]);
        root.right = helper(post, in, mp.get(root.val)+1, inE, mp);
        root.left = helper(post, in, inS, mp.get(root.val)-1, mp);
		return root;
	}
}
*/