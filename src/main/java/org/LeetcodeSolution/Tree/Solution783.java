package org.LeetcodeSolution.Tree;

import org.LeetcodeSolution.DataStructure.tree.BinaryTreeNode;

/**
 * Problem
 *     783.Minimum Distance Between BST Nodes
 *     https://leetcode.com/problems/minimum-distance-between-bst-nodes/
 *     https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 *
 * @version 1.0
 */
public class Solution783 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 因为题目指出待遍历的树是二叉搜索树，所以中序遍历结果肯定为有序数组
     *     2.2 因为题目要求求出结点的最小距离，所以这个距离肯定发生在相邻结点之间
     *     2.3 定义两个变量记录遍历过程对比结果
     *     2.4 中序遍历二叉树，对比当前结点与上一结点的差与当前最小距离，并根据对比结果适当调整变量的值
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗35MB内存
     *     3.2 leetcode中耗时0ms,消耗34.5MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 cause topic has pointed out traverse tree is BST,so inOrder traverse tree must be sorted array
     *     2.2 cause topic ask us to calculate minimum distance,this distance must be appearance adjacent node
     *     2.3 use two variable to record min distance and last traverse node
     *     2.4 recurse tree by inOrder traverse,compare current node val subtract last node val result and min distance
     * 3.About submit record
     *     3.1 1ms and 35MB memory in LeetCode China
     *     3.2 0ms and 34.5MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public int minDiffInBST(BinaryTreeNode root) {
        min=Integer.MAX_VALUE;
        last=Integer.MAX_VALUE;
        inOrder(root);
        return min;
    }

    private int last;

    private int min;

    private void inOrder(BinaryTreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        if(last!=Integer.MAX_VALUE){
            min=Math.min(min,root.val-last);
        }
        last=root.val;
        inOrder(root.right);
    }
}
