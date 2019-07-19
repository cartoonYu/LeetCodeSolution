import DataStructure.BinaryTreeNode;

/**
 * Problem
 *      100.Same Tree
 *      https://leetcode.com/problems/same-tree/
 *      https://leetcode-cn.com/problems/same-tree/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution100 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为O(n)
     *   1.2 空间负责度为O(1)
     * 2.我的解题思路
     *   2.1 主要解法是同时前序遍历两棵树
     *   2.2 树相等，要遵循以下的情况之一
     *       2.2.1 左子树都为空
     *       2.2.2 右子树都为空
     *       2.2.3 当前节点值相等
     *   2.3 递归中，需要判断如下的情况(按顺序)
     *       2.3.1 如果当前节点都为空，返回true
     *       2.3.2 当前节点只有一个为空，返回false
     *       2.3.3 当前节点的值不相等，返回false
     *   2.4 递归判断左右子树
     * 3.提交记录
     *   3.1 力扣中耗时1ms,消耗33.8MB内存
     *   3.2 leetcode中耗时0ms,消耗33.2MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 use recursion to compare two tree
     *     2.2 there have three situation of the recursion
     *         2.2.1 p==null and q==null,two node is same
     *         2.2.2 p==null or q==null,cause I judge p==null and q==null before,so this judgement is two node is not same
     *         2.2.3 p.val!=q.val,the two node is not same
     *     2.3 traverse all node by recursion to judge
     * 3.About submit record
     *     3.1 1ms and 33.8MB memory in LeetCode China
     *     3.2 0ms and 33.2MB memory in LeetCode
     * 4.Q&A
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(BinaryTreeNode p, BinaryTreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        if(q.val!=p.val){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
