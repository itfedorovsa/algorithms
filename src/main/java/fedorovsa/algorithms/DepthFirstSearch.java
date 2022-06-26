package fedorovsa.algorithms;

import java.util.Stack;

public class DepthFirstSearch {

    public int sumRec(Tree tree) {
        int result = tree.value;
        if (tree.left != null) {
            result += sumRec(tree.left);
        }
        if (tree.right != null) {
            result += sumRec(tree.right);
        }
        return result;
    }

    public int sumIter(Tree tree) {
        Stack<Tree> stack = new Stack<>();
        int result = 0;
        stack.push(tree);
        while (!stack.empty()) {
            Tree node = stack.pop();
            result += node.value;
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
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
        System.out.println(dfs.sumRec(tree));
        System.out.println(dfs.sumIter(tree));
    }
}
