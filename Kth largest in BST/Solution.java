// Editorial:
/* Logic:
        opposite inorder traversal, Right Left Node
*/
class Solution
{
    int count =0;
    int result = -1;
	void kthLargestUtil(Node root, int k ) 
    { 
        
        if (root == null || count >= k) 
            return; 
        kthLargestUtil(root.right, k);  
        count++;

        if (count == k) { 
            result = root.data;
            return; 
        }
        kthLargestUtil(root.left, k);
    } 
  
    int kthLargest(Node root, int k) 
    { 
        kthLargestUtil(root, k); 
        return result;
    } 
}

//My Solution:
class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        List<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        return arr.get(arr.size()-K);
    }
    
    public void inorder(Node root, List<Integer> arr) {
        if(root == null) return;
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }
}
