/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            TreeNode curr = q.poll();
            if(curr == null) {
                sb.append("$ ");
                continue;
            }
            sb.append(curr.val + " ");
            q.offer(curr.left);
            q.offer(curr.right);
        }
        return sb.toString();
    }
    

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == "") return null;
        Queue<TreeNode> q = new LinkedList<>();
        String[] values = data.trim().split(" ");
        TreeNode root = new TreeNode(Integer.valueOf(values[0]));
        q.offer(root);
        for(int i = 1; i < values.length; i++) {
            TreeNode parent = q.poll();
            if(!values[i].equals("$")) {
                TreeNode left = new TreeNode(Integer.valueOf(values[i]));
                parent.left = left;
                q.offer(left);
            }
            if(!values[++i].equals("$")) {
                TreeNode right = new TreeNode(Integer.valueOf(values[i]));
                parent.right = right;
                q.offer(right);
            }
        }
        return root;
        
    }
    

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
/*
public class Codec {

    // Encodes a tree to a single string.
    static final int EMPTY = 1001;
    int index = 0;
    public String serialize(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        serial(root, arr);
        return arr.toString();
    }
    
    public void serial(TreeNode root, ArrayList<Integer> arr) {
        if(root == null) {
            arr.add(EMPTY);
            return;
        }
        arr.add(root.val);
        serial(root.left, arr);
        serial(root.right, arr);
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        StringBuilder sb = new StringBuilder(data);
        sb.deleteCharAt(sb.length()-1); sb.deleteCharAt(0);
        String[] str = sb.toString().split(",");
        ArrayList<Integer> arr = new ArrayList<>();
        for(String s:str) {
            arr.add(Integer.valueOf(s.trim()));
        }
        return deserial(arr);
    }
    
    public TreeNode deserial(ArrayList<Integer> arr) {
        if(index == arr.size()) return null;
        int val = arr.get(index);
        index++;
        if(val == EMPTY) return null;
        TreeNode root = new TreeNode(val);
        root.left = deserial(arr);
        root.right = deserial(arr);
        return root;
    }
}
*/