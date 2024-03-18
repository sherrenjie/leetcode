class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode p, TreeNode q){
        if(p == null && q == null) {
            return true;
        }

        if(p == null || q == null) {
            return false;
        }

        if(p.val != q.val) {
            return false;
        }

        boolean check1 = isMirror(p.left, q.right);
        boolean check2 = isMirror(p.right, q.left);
        return check1 && check2;
    }
}
