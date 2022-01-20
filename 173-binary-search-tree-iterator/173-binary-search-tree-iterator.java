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
class BSTIterator {
    private Stack<TreeNode> st = new Stack<>();
    public BSTIterator(TreeNode root) {
        pushAll(root);
    }
    
    public int next() {
        if(hasNext()) {
            TreeNode curr = st.pop();
            pushAll(curr.right);
            return curr.val;
        }
        return -1;
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
    
    private void pushAll(TreeNode root) {
        while(root != null) {
            st.push(root);
            root = root.left;
        }
    }
}

/*
class BSTIterator {
    List<Integer> arr;
    int index;
    public BSTIterator(TreeNode root) {
        arr = new ArrayList<>();
        inorder(root);
        index = 0;
    }
    
    private void inorder(TreeNode root) {
        if(root == null) return;
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
    
    public int next() {
        if(hasNext()) {
            int val = arr.get(index);
            index++;
            return val;
        }
        return -1;
    }
    
    public boolean hasNext() {
        if(index < arr.size())
            return true;
        return false;
    }
}

*/

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */