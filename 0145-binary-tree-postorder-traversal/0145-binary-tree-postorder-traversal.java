/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> st = new Stack<>();
        TreeNode prev = null;
        st.push(root);
        while (!st.isEmpty()) {
            TreeNode top = st.peek();
            if (prev == null || prev.left == top || prev.right == top) {
                if (top.left != null) {
                    st.push(top.left);
                } else if (top.right != null) {
                    st.push(top.right);
                } else {
                    st.pop();
                    list.add(top.val);
                }
            }
            else if(top.left == prev){
                if(top.right != null){
                    st.push(top.right);
                }
                else{
                    st.pop();
                    list.add(top.val);
                }
            }
            else if(top.right == prev){
                st.pop();
                list.add(top.val);
            }
            prev = top;
            }
            return list;
        }
    }
