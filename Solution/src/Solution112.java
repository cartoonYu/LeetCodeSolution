import DataStructure.BinaryTreeNode;

/**
 * Problem
 *      112.Path Sum
 *      https://leetcode.com/problems/path-sum/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      98. Validate Binary Search Tree
 *      104.Maximum Depth of Binary Tree
 *      110.Balanced Binary Tree
 *      111.Minimum Depth of Binary Tree
 *      113. Path Sum II
 *      129.Sum Root to Leaf Numbers
 *      144.Binary Tree Preorder Traversal
 *      145.Binary Tree Postorder Traversal
 *      222.Count Complete Tree Nodes
 *      230.Kth Smallest Element in a BST
 *      687.Longest Univalue Path
 *      965.Univalued Binary Tree
 * @author cartoon
 * @version 1.0
 */
public class Solution112 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on depth traversal
     *     2.2 compare with current node's val and sum
     * 3.About submit record
     *     3.1 1ms and 37MB memory in LeetCode China
     *     3.2 0ms and 38.9MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum(BinaryTreeNode root, int sum) {
        if(root==null){
            return false;
        }
        if(root.left==null&&root.right==null){
            return root.val==sum;
        }
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}
