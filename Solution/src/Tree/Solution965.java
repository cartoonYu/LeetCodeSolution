package Tree;

import DataStructure.BinaryTreeNode;

/**
 * Problem
 *     965.Univalued Binary Tree
 *     https://leetcode.com/problems/univalued-binary-tree/
 * Grade of difficulty
 *     Easy
 * Related topics
 *     94.Binary Tree Inorder Traversal
 *     98. Validate Binary Search Tree
 *     104.Maximum Depth of Binary Tree
 *     110.Balanced Binary Tree
 *     111.Minimum Depth of Binary Tree
 *     112.Path Sum
 *     113. Path Sum II
 *     129.Sum Root to Leaf Numbers
 *     145.Binary Tree Postorder Traversal
 *     144.Binary Tree Preorder Traversal
 *     222.Count Complete Tree Nodes
 *     230.Kth Smallest Element in a BST
 *     687.Longest Univalue Path
 * @author cartoon
 * @version 1.0
 */
public class Solution965 {

    private int num;

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on preOrder traversal
     *     2.2 use a integer to record root val
     *     2.3 compare current node val in recursion to cache integer
     * 3.About submit record
     *     3.1 0ms and 34.5MB memory in LeetCode China
     *     3.2 0ms and 34.3MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public boolean isUnivalTree(BinaryTreeNode root) {
        if(root==null){
            return true;
        }
        num=root.val;
        return preOrder(root);
    }

    private boolean preOrder(BinaryTreeNode root){
        if(root==null){
            return true;
        }
        if(num!=root.val){
            return false;
        }
        return preOrder(root.left)&&preOrder(root.right);
    }

}
