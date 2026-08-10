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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;
        if(key < root.val) root.left = deleteNode(root.left,key);
        else if(key > root.val) root.right = deleteNode(root.right,key);
        else{
            if(root.left == null && root.right == null){
                return null;
            }
            else if(root.left != null && root.right == null){
                return root.left;
            }
            else if(root.left == null && root.right != null){
                return root.right;
            }
            root.val = minNode(root.right);
            root.right = deleteNode(root.right,root.val);
        }
        return root;
    }
    private int minNode(TreeNode root){
        if(root.left == null) return root.val;
        return minNode(root.left);
    }
}