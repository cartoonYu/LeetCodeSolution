import DataStructure.BinaryTreeNode;

/**
 * Problem
 *      530.Minimum Absolute Difference in BST
 * Grade of difficulty
 *      Easy
 * Related topics
 *
 * @author cartoon
 * @version 1.0
 */
public class Solution530 {

    private int result;

    private int pre;

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 The solution is base on BST,a in-order ascending tree
     *     2.2 use a inOrder to go through tree and use a pre num to record last node's val
     * 3.About submit record
     *     3.1 2ms and 38.3MB memory in LeetCode China
     *     3.2 1ms and 38.4MB memory in LeetCode
     * 4.Q&A
     *
     * @param root
     * @return
     */
    public int getMinimumDifference(BinaryTreeNode root) {
        if(root==null){
            return result;
        }
        result=Integer.MAX_VALUE;
        pre=Integer.MAX_VALUE;
        inOrder(root);
        return result;
    }

    private void inOrder(BinaryTreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        int temp=Math.abs(root.val-pre);
        result=result<temp?result:temp;
        pre=root.val;
        inOrder(root.right);
    }
}
