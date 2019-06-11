import DataStructure.BinaryTreeNode;
/**
 * Problem
 *      111.Minimum Depth of Binary Tree
 * Grade of difficulty
 *      Easy
 * Related topics
 *      98. Validate Binary Search Tree
 *      110.Balanced Binary Tree
 *      129.Sum Root to Leaf Numbers
 *      144.Binary Tree Preorder Traversal
 * @author cartoon
 * @version 1.0
 */
public class Solution111 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     This solution is base on depth traversal
     *     2.1 judge null when traversal
     *     2.2 compare left children tree to right children tree depth
     * 3.About submit record
     *     3.1 1ms and 39.4MB memory in LeetCode China
     *     3.2 0ms and 39.9MB memory in LeetCode
     * 4.Q&A
     *
     * @param root
     * @return
     */
    public int minDepth(BinaryTreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        if(root.left==null){
            return minDepth(root.right)+1;
        }
        if(root.right==null){
            return minDepth(root.left)+1;
        }
        return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }

}
