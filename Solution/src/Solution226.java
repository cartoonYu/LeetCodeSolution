import DataStructure.BinaryTreeNode;
/**
 * Problem
 *     226.Invert Binary Tree
 *     https://leetcode.com/problems/invert-binary-tree/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution226 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 cache left children tree
     *     2.2 recurse to set right tree to left
     *     2.3 recurse to set left tree to right
     * 3.About submit record
     *     3.1 0ms and 33.4MB memory in LeetCode China
     *     3.2 0ms and 35.8MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public BinaryTreeNode invertTree(BinaryTreeNode root) {
        if(root==null){
            return root;
        }
        BinaryTreeNode node=root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(node);
        return root;
    }
}
