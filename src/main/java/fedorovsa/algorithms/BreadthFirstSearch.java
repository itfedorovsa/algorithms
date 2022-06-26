package fedorovsa.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public int sum(Tree tree) {
        Queue<Tree> queue = new LinkedList<>();
        queue.offer(tree);
        int result = 0;
        while (!queue.isEmpty()) {
            Tree node = queue.poll();
            result += node.value;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
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
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        System.out.println(bfs.sum(tree));
    }
}
