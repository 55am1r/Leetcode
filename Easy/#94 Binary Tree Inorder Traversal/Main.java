import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = null;
        treeNode1.right = new TreeNode(2);
        treeNode1.right.left = new TreeNode(3);
        inorderTraversal(treeNode1);
    }

    private static void inOrder(TreeNode root, List<Integer> valueList) {
        if (root == null) {
            return;
        }
        inOrder(root.left, valueList);
        valueList.add(root.val);
        inOrder(root.right, valueList);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> valueList = new LinkedList<>();
        inOrder(root, valueList);
        return valueList;
    }
}