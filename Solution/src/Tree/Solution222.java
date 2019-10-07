package Tree;

import DataStructure.BinaryTreeNode;

/**
 * Problem
 *     222.Count Complete Tree Nodes/完全二叉树的节点个数
 *     https://leetcode.com/problems/count-complete-tree-nodes/
 *     https://leetcode-cn.com/problems/count-complete-tree-nodes/submissions/
 * Grade of difficulty
 *     Medium
 * Related topics
 *     94.Binary Tree Inorder Traversal
 *     98. Validate Binary Search Tree
 *     104.Maximum Depth of Binary Tree
 *     110.Balanced Binary Tree
 *     111.Minimum Depth of Binary Tree
 *     112.Path Sum
 *     113. Path Sum II
 *     129.Sum Root to Leaf Numbers
 *     144.Binary Tree Preorder Traversal
 *     145.Binary Tree Postorder Traversal
 *     230.Kth Smallest Element in a BST
 *     687.Longest Univalue Path
 *     965.Univalued Binary Tree
 * @author cartoon
 * @version 1.0
 */
public class Solution222 {

    /**
     * 1.关于复杂度
     *  1.1 时间复杂度为O()
     *  1.2 空间负责度为O()
     * 2.我的解题思路
     *  2.1 这个算法基于深度优先遍历而来
     *  2.2 定义一个整形变量用于存储节点数量
     *  2.3 递归遍历树，每遍历一个节点自增缓存变量
     * 3.提交记录
     *  3.1 力扣中耗时1ms,消耗40MB内存
     *  3.2 leetcode中耗时0ms,消耗39.1MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on depth traversal
     *     2.2 define a integer to cache node number
     *     2.3 recurse to go though tree and increase cache variable
     * 3.About submit record
     *     3.1 1ms and 40MB memory in LeetCode China
     *     3.2 0ms and 39.1MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public int countNodes(BinaryTreeNode root) {
        res=0;
        preOrder(root);
        return res;
    }

    private int res;

    private void preOrder(BinaryTreeNode root){
        if(root==null){
            return;
        }
        res++;
        preOrder(root.left);
        preOrder(root.right);
    }
}
