package org.LeetcodeSolution.Tree;

import org.LeetcodeSolution.DataStructure.tree.BinaryTreeNode;

/**
 * Problem
 *     538.Convert BST to Greater Tree
 *     https://leetcode.com/problems/convert-bst-to-greater-tree/
 *     https://leetcode-cn.com/problems/convert-bst-to-greater-tree/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution538 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为O(n)
     *   1.2 空间负责度为O(1)
     * 2.我的解题思路
     *   2.1 定义一个整数用于缓存计算结果
     *   2.2 逆中序遍历(遍历右子树，根节点，左子树)二叉树，将当前节点值与缓存值相加后赋回给当前节点和缓存变量
     * 3.提交记录
     *   3.1 力扣中耗时1ms,消耗45.1MB内存
     *   3.2 leetcode中耗时1ms,消耗39.7MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 use a integer to cache plus result
     *     2.2 reverse inOrder to traverse root,plus cache result to current node val and set current node val to cache result
     * 3.About submit record
     *     3.1 1ms and 45.1MB memory in LeetCode China
     *     3.2 1ms and 39.7MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public BinaryTreeNode convertBST(BinaryTreeNode root) {
        sum=0;
        inOrder(root);
        return root;
    }

    private int sum;

    private void inOrder(BinaryTreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.right);
        root.val+=sum;
        sum=root.val;
        inOrder(root.left);
    }
}
