package Tree;

import DataStructure.BinaryTreeNode;

/**
 * Problem
 *     101.Symmetric Tree
 *     https://leetcode.com/problems/symmetric-tree/
 *     https://leetcode-cn.com/problems/symmetric-tree/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution101 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 判断树是否为空，若为空肯定是对称二叉树
     *     2.2 递归对比左右子树，有5个情况
     *         2.2.1 左右子树同时为空，返回true
     *         2.2.2 左子树与右子树一个为空，一个不为空，返回false
     *         2.2.3 当前结点与右边结点的val相等，继续递归对比
     *         2.2.4 当前结点与右边结点的val步相等，返回false
     * 3.提交记录
     *     3.1 力扣中耗时2ms,消耗36MB内存
     *     3.2 leetcode中耗时0ms,消耗37.4MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 judge whether root=null,if it is return true
     *     2.2 compare left tree to right tree,there have five condition
     *          2.2.1 left node==null&&right node==null,return true
     *          2.2.2 left node!=null&&right node==null,return false
     *          2.2.3 left node==null&&right node!=null,return false
     *          2.2.4 left node.val=right node.val,recurse compare its left tree and right tree
     *          2.2.5 left node.val!=right node.val,return false
     * 3.About submit record
     *     3.1 2ms and 36MB memory in LeetCode China
     *     3.2 0ms and 37.4MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public boolean isSymmetric(BinaryTreeNode root) {
        if(root==null){
            return true;
        }
        return judge(root.left,root.right);
    }

    private boolean judge(BinaryTreeNode t1,BinaryTreeNode t2){
        if(t1==null&&t2==null){
            return true;
        }
        else{
            if((t1==null&&t2!=null)||(t1!=null&&t2==null)){
                return false;
            }
            else{
                if(t1.val==t2.val){
                    return judge(t1.left,t2.right)&&judge(t1.right,t2.left);
                }
                else{
                    return false;
                }
            }
        }
    }
}
