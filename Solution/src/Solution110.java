import DataStructure.BinaryTreeNode;

/**
 * Problem
 *      110.Balanced Binary Tree
 * Grade of difficulty
 *      Easy
 * Related topics
 *      98. Validate Binary Search Tree
 *      111.Minimum Depth of Binary Tree
 *      129.Sum Root to Leaf Numbers
 *      144.Binary Tree Preorder Traversal
 * @author cartoon
 * @version 1.0
 */
public class Solution110 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on depth traversal
     *     2.2 static height of left right children tree,compare their height
     * 3.About submit record
     *     3.1 2ms and 39.5MB memory in LeetCode China
     *     3.2 0ms and 38.6MB memory in LeetCode
     * 4.Q&A
     *
     * @param root
     * @return
     */
    public boolean isBalanced(BinaryTreeNode root) {
        return height(root)!=-1;
    }

    private int height(BinaryTreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        if(left==-1){
            return -1;
        }
        int right=height(root.right);
        if(right==-1||Math.abs(left-right)>1){
            return -1;
        }
        return Math.max(left,right)+1;
    }
}
