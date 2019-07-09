import DataStructure.BinaryTreeNode;

/**
 * Problem
 *      104.Maximum Depth of Binary Tree
 *      https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      94.Binary Tree Inorder Traversal
 *      98. Validate Binary Search Tree
 *      110.Balanced Binary Tree
 *      111.Minimum Depth of Binary Tree
 *      112.Path Sum
 *      113. Path Sum II
 *      129.Sum Root to Leaf Numbers
 *      144.Binary Tree Preorder Traversal
 *      145.Binary Tree Postorder Traversal
 *      230.Kth Smallest Element in a BST
 *      687.Longest Univalue Path
 *      965.Univalued Binary Tree
 * @author cartoon
 * @version 1.0
 */
public class Solution104 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on depth traversal
     *     2.2 compare with left tree and right tree depth,return its max value+1
     * 3.About submit record
     *     3.1 1ms and 38.2MB memory in LeetCode China
     *     3.2 0ms and 40.2MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public int maxDepth(BinaryTreeNode root) {
        if(root==null){
            return 0;
        }
        else{
            int left=maxDepth(root.left);
            int right=maxDepth(root.right);
            int depth=Math.max(left,right)+1;
            return depth;
        }
    }
}
