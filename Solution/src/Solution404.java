import DataStructure.BinaryTreeNode;

/**
 * Problem
 *      404.Sum of Left Leaves
 *      https://leetcode.com/problems/sum-of-left-leaves/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      None
 * @author cartoon
 * @version 1.0
 */
public class Solution404 {

    private int sum;

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(logn)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 This solution is base on preorder traversal,and you can also use other traversal,the result is same
     *     2.2 judge current node has left child and right child,if it doesn't,plus it's val
     * 3.About submit record
     *     3.1 1ms and 34.2MB memory in LeetCode China
     *     3.2 0ms and 35.5MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public int sumOfLeftLeaves(BinaryTreeNode root) {
        sum=0;
        preOrder(root);
        return sum;
    }

    private void preOrder(BinaryTreeNode root){
        if(root==null){
            return;
        }
        if(root.left!=null&&root.left.left==null&&root.left.right==null){
            sum+=root.left.val;
        }
        preOrder(root.left);
        preOrder(root.right);
    }
}
