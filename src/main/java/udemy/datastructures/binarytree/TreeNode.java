package udemy.datastructures.binarytree;

import java.util.List;

/**
 * Implementation of Binary Tree
 * Basically elements to the left are smaller than the root
 * (so the point of comparison)
 * if it goes to the right it is greater than root
 * Created by rafae on 6/23/2017.
 */
public class TreeNode {

    private int root;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int root) {
        this.root = root;
    }

    /**
     *
     * @param newRoot
     */
    public void addNode(int newRoot) {
        if(newRoot < root) {
            if(left == null) {
                left = new TreeNode(newRoot);
            } else {
                left.addNode(newRoot);
            }
        } else {
            if (right == null) {
                right = new TreeNode(newRoot);
            } else {
                right.addNode(newRoot);
            }
        }
    }

    public void preOrderTraversal(List<Integer> list){
        if (left != null) {
            left.preOrderTraversal(list);
        }
        list.add(root);
        if(right != null) {
            right.preOrderTraversal(list);
        }
    }

    public void postOrderTraversal(List<Integer> list){
        if(right != null) {
            right.postOrderTraversal(list);
        }
        list.add(root);
        if(left != null) {
            left.postOrderTraversal(list);
        }
    }

}
