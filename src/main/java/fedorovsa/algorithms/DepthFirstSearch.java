package fedorovsa.algorithms;

public class DepthFirstSearch {

    public int sum(Tree tree) {
        int result = tree.value;
        if (tree.left != null) {
            result += sum(tree.left);
        }
        if (tree.right != null) {
            result += sum(tree.right);
        }
        return result;
    }

    static class Tree {
        int value;
        Tree left;
        Tree right;

        public Tree(int value) {
            this.value = value;
        }

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree(5,
                new Tree(10, new Tree(1),
                        new Tree(3, null, new Tree(9))),
                new Tree(6, null, new Tree(8)));
        DepthFirstSearch dfs = new DepthFirstSearch();
        System.out.println(dfs.sum(tree));
    }
}
