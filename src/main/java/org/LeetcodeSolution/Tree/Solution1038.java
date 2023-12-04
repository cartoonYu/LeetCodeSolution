package org.LeetcodeSolution.Tree;

import org.LeetcodeSolution.DataStructure.tree.BinaryTreeNode;

/**
 * Problem
 *     <a href="https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/description/">leetcode.com</a>
 *     <a href="https://leetcode.cn/problems/binary-search-tree-to-greater-sum-tree/description/">leetcode.cn</a>
 * <br/>Grade of difficulty<br/>
 *     Medium
 * @author cartoon
 * @version 1.0
 */
public class Solution1038 {

    private int sum = 0;

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 define origin sum is 0
     *     2.2 traverse right subtree
     *     2.3 replace current sum to node val, add current node to sum
     *     2.4 traverse left tree
     * 3.Q&A
     * @param root tree root node
     * @return tree root node
     */
    public BinaryTreeNode bstToGst(BinaryTreeNode root) {
        traverse(root);
        return root;
    }

    private void traverse(BinaryTreeNode root){
        if(root == null){
            return;
        }
        traverse(root.right);
        root.val += sum;
        sum = root.val;
        traverse(root.left);
    }
}
