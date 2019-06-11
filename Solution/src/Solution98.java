import DataStructure.BinaryTreeNode;

/**
 * Problem
 *      98. Validate Binary Search Tree
 * Grade of difficulty
 *      Medium
 * Related topics
 *      110.Balanced Binary Tree
 *      111.Minimum Depth of Binary Tree
 *      129.Sum Root to Leaf Numbers
 *      144.Binary Tree Preorder Traversal
 * @author cartoon
 * @version 1.0
 */
public class Solution98 {

    double last = -Double.MAX_VALUE;

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on inorder traversal
     *     2.2 root's val is less than right children's val and greater than left children's val
     * 3.About submit record
     *     3.1 1ms and 37.7MB memory in LeetCode China
     *     3.2 0ms and 38.2MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public boolean isValidBST(BinaryTreeNode root) {
        if (root == null) {
            return true;
        }
        if (isValidBST(root.left)) {
            if (last < root.val) {
                last = root.val;
                return isValidBST(root.right);
            }
        }
        return false;
    }
}
