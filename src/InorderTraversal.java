/**
 * Created by shekhars on 4/21/2017.
 */
public class InorderTraversal {
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

        inorder(t1);


    }

    private static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

}
