public class MySol {
    private static int total;

    public int sumNumbers(TreeNode root) {
        total = 0;
        recSumNumbers(root, 0);
        return total;
    }

    private static void recSumNumbers(TreeNode root, int sum) {
        if (root == null) return;

        sum = sum * 10 + root.val;

        if (root.left == null && root.right == null) {
            total += sum;
        }
        recSumNumbers(root.left, sum);
        recSumNumbers(root.right, sum);

    }
}