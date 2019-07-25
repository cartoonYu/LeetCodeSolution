import DataStructure.BinaryTreeNode;

/**
 * Problem
 *      530.Minimum Absolute Difference in BST
 *      https://leetcode.com/problems/minimum-absolute-difference-in-bst/
 *      https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution530 {

    private int result;

    private int pre;

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 因为题目给出的是二叉搜索树，所以中序遍历后可以得到升序的有序数组
     *     2.2 中序遍历树，用一个暂存变量记录上次遍历的结点值
     * 3.提交记录
     *     3.1 力扣中耗时2ms,消耗38.3MB内存
     *     3.2 leetcode中耗时1ms,消耗38.4MB内存
     * 4.Q&A
     *
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
