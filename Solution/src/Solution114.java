import DataStructure.BinaryTreeNode;

/**
 * Problem
 *     114.Flatten Binary Tree to Linked List
 *     https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
 *     https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution114 {

    /**
     * 1. 关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2. 我的解题思路
     *     2.1 这个解法基于后序遍历
     *     2.2 传统的后序遍历，对每一遍历结点进行如下操作
     *         2.2.1 保存右孩子
     *         2.2.2 将左孩子设置为右孩子，将原来的左孩子设置为null
     *         2.2.3 循环遍历找到插入2.2.1缓存结点的位置
     * 3. 提交记录
     *     3.1 力扣中耗时1ms,消耗35.6MB内存
     *     3.2 leetcode中耗时1ms,消耗36.1MB内存
     * 4. Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on post order traversal
     *     2.2 traditional traversal,every node will be operated
     *         2.2.1 cache its right children
     *         2.2.2 make its left children to right children and set origin left children
     *         2.2.3 circulate when right children is null,set 2.2.1 cache node to right children
     * 3.About submit record
     *     3.1 1ms and 35.6MB memory in LeetCode China
     *     3.2 1ms and 36.1MB memory in LeetCode
     * 4.Q&A
     *
     * @param root
     */
    public void flatten(BinaryTreeNode root) {
        if(root==null){
            return;
        }
        flatten(root.left);
        flatten(root.right);
        BinaryTreeNode node=root.right;
        root.right=root.left;
        root.left=null;
        while(root.right!=null){
            root=root.right;
        }
        root.right=node;
    }
}
