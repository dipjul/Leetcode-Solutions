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

    Map<Integer, Integer> mp = mp = new HashMap<>();
    int maxCount = 0;
    public int[] findFrequentTreeSum(TreeNode root) {
        sum(root);
        List<Integer> res = new ArrayList<>();
        for(int key:mp.keySet()) {
            if(mp.get(key) == maxCount)
                res.add(key);
        }

        // int[] result = new int[res.size()];
        // for(int i = 0; i < res.size(); i++) {
        //     result[i] = res.get(i);
        // }
        return res.stream().mapToInt(i->i).toArray();
    }
    
    public int sum(TreeNode root) {
        if(root == null) return 0;
        int currSum = root.val + sum(root.left) + sum(root.right);
        mp.put(currSum, mp.getOrDefault(currSum, 0)+1);
        maxCount = Math.max(maxCount, mp.get(currSum));
        return currSum;
    }
}