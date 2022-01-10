/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T>
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

public class Solution {
	public static int x = Integer.MIN_VALUE;
    public static int floorInBST(TreeNode<Integer> root, int X) {
        //    Write your code here.
        x = Integer.MIN_VALUE;
        helper(root, X);
		return x;
    }
    
    public static void helper(TreeNode<Integer> root, int X) {
        if(root == null) return;
        if(root.data == X){
            x = X;
            return;
        } else if(root.data < X) {
            x = Math.max(x, root.data);
            helper(root.right, X);
        } else {
            helper(root.left, X);
        }
    }
}
