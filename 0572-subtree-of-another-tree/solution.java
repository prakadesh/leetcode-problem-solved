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
    
    public static boolean check(TreeNode t1, TreeNode t2) {
        if(t1==null && t2==null) {
            return true;
        }
        if(t1==null || t2==null) {
            return false;
        }
        return (t1.val==t2.val) && check(t1.left, t2.left) && check(t1.right, t2.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot==null) {
            return true;
        }
        if(root==null || subRoot==null) {
            return false;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int n = q .size();
            for(int i=1; i<=n; i++) {
                TreeNode curr = q.poll();
                boolean flag = check(curr, subRoot);
                if(flag == true) {
                    return true;
                }
                if(curr.left!=null) {
                    q.add(curr.left);
                }
                if(curr.right!=null) {
                    q.add(curr.right);
                }
            }
        }
        return false;

    }
}
