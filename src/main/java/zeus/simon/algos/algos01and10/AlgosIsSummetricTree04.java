package zeus.simon.algos.algos01and10;

import zeus.simon.algos.TreeNode;

import java.util.Stack;

/**
 * 判断二叉树是否沿中轴线对称
 */
public class AlgosIsSummetricTree04 {

    private boolean isSummetric(TreeNode s, TreeNode t) {
        if (s != null && t != null) {
            return s.val == t.val && isSummetric(s.left, t.right) && isSummetric(s.right, t.left);
        } else
            return s == null && t == null;
    }


    // Time:O(n),Space:O(n)
    public boolean isSymmetricTreeRecursive(TreeNode root) {
        if (root == null) return true;
        return isSummetric(root.left, root.right);
    }


    // Time:O(n),Space:O(n)
    public boolean isSymmetricTreeIterative(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while (!stack.empty()) {
            TreeNode s = stack.pop(), t = stack.pop();
            if (s == null && t == null) continue;
            if (s == null || t == null) return false;
            if (s.val != t.val) return false;
            stack.push(s.left);
            stack.push(t.right);
            stack.push(s.right);
            stack.push(t.left);
        }
        return true;
    }
}
