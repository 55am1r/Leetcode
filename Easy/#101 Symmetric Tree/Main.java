import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, null, new TreeNode(3));
        root.right = new TreeNode(2, new TreeNode(3), null);
        // root.left.right.left = new TreeNode(8);
        // root.left.right.right = new TreeNode(9);
        // root.right.right.left = new TreeNode(9);
        // root.right.right.right = new TreeNode(8);
        System.out.println(isSymmetric(root));
    }

    public static Integer preOrder(TreeNode root, ArrayList<Integer> valList) {
        if (root == null) {
            valList.add(null);
            return null;
        }
        valList.add(root.val);
        preOrder(root.left, valList);
        preOrder(root.right, valList);
        return 1;
    }

    public static Integer postOrder(TreeNode root, ArrayList<Integer> valList) {
        if (root == null) {
            valList.add(null);
            return null;
        }
        postOrder(root.left, valList);
        postOrder(root.right, valList);
        valList.add(root.val);

        return 1;
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        ArrayList<Integer> leftTreeVals = new ArrayList<>();
        ArrayList<Integer> rightTreeVals = new ArrayList<>();

        preOrder(root.left, leftTreeVals);
        postOrder(root.right, rightTreeVals);

        if (leftTreeVals.size() != rightTreeVals.size()) {
            return false;
        }
        for (int i = 0, j = rightTreeVals.size() - 1; i < leftTreeVals.size(); i++, j--) {
            if (leftTreeVals.get(i) != rightTreeVals.get(j)) {
                return false;
            }
        }

        return true;
    }
}