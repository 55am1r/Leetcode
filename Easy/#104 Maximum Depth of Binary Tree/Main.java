public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        // root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        root.left = new TreeNode(9);

        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }
}