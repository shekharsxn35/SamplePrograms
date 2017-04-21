import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by shekhars on 4/21/2017.
 */
public class RightViewOfTree {

    public static void main(String[] args) {
        TreeNode<Integer> t1 = new TreeNode<>(1);
        TreeNode<Integer> t2 = new TreeNode<>(2);
        TreeNode<Integer> t3 = new TreeNode<>(3);
        TreeNode<Integer> t4 = new TreeNode<>(4);
        TreeNode<Integer> t5 = new TreeNode<>(5);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;

        rightView(t1);
    }

    private static void rightView(TreeNode<Integer> root) {
        List<Integer> result = new LinkedList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode<Integer> node = queue.poll();
                if (i == 0) {
                    result.add(node.value);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }

            }
        }

        System.out.println("The List is " + result);

    }
}
