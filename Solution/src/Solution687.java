import DataStructure.BinaryTreeNode;

/**
 * Problem
 *      687.Longest Univalue Path
 *      https://leetcode.com/problems/longest-univalue-path/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      94.Binary Tree Inorder Traversal
 *      98. Validate Binary Search Tree
 *      104.Maximum Depth of Binary Tree
 *      110.Balanced Binary Tree
 *      111.Minimum Depth of Binary Tree
 *      112.Path Sum
 *      113. Path Sum II
 *      129.Sum Root to Leaf Numbers
 *      145.Binary Tree Postorder Traversal
 *      144.Binary Tree Preorder Traversal
 *      222.Count Complete Tree Nodes
 *      230.Kth Smallest Element in a BST
 *      965.Univalued Binary Tree
 * @author cartoon
 * @version 1.0
 */
public class Solution687 {

    private int max;

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on depth traversal
     *     2.2 static left and right children tree's depth,and at the same time judge current node's val is same as parent's val
     * 3.About submit record
     *     3.1 9ms and 51.8MB memory in LeetCode China
     *     3.2 3ms and 40.5MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public int longestUnivaluePath(BinaryTreeNode root) {
        if(root==null){
            return 0;
        }
        preOrder(root,root.val);
        return max;
    }

    private int preOrder(BinaryTreeNode root,int val){
        if(root==null){
            return 0;
        }
        int left=preOrder(root.left,root.val);
        int right=preOrder(root.right,root.val);
        max=Math.max(max,left+right);
        if(root.val==val){
            return Math.max(left,right)+1;
        }
        return 0;
    }
}
