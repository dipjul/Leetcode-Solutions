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
	public static int min = Integer.MAX_VALUE;
    public  static int findCeil(TreeNode<Integer> node, int x) {

        // Write your code here
		min = Integer.MAX_VALUE;
        helper(node, x);
        return min == Integer.MAX_VALUE? -1:min;
    }
    public static void helper(TreeNode<Integer> root, int X) {
        if(root == null) return;
        if(root.data == X){
            min = X;
            return;
        } else if(root.data < X) {
            //x = Math.max(x, root.data);
            helper(root.right, X);
        } else {
            min = Math.min(min, root.data);
            helper(root.left, X);
        }
    }
}
