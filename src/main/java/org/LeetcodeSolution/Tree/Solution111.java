package org.LeetcodeSolution.Tree;

import org.LeetcodeSolution.DataStructure.tree.BinaryTreeNode;

/**
 * Problem
 *      111.Minimum Depth of Binary Tree/二叉树的最小深度
 *      https://leetcode.com/problems/minimum-depth-of-binary-tree/
 *      https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      94.Binary Tree Inorder Traversal
 *      98. Validate Binary Search Tree
 *      104.Maximum Depth of Binary Tree
 *      110.Balanced Binary Tree
 *      112.Path Sum
 *      113. Path Sum II
 *      129.Sum Root to Leaf Numbers
 *      144.Binary Tree Preorder Traversal
 *      145.Binary Tree Postorder Traversal
 *      222.Count Complete Tree Nodes
 *      230.Kth Smallest Element in a BST
 *      687.Longest Univalue Path
 *      965.Univalued Binary Tree
 * @author cartoon
 * @version 1.0
 */
public class Solution111 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为O(n)
     *   1.2 空间负责度为O(n)
     * 2.我的解题思路
     *   2.1 解法基于深度优先遍历
     *   2.2 递归遍历树
     *       2.2.1 若当前节点没有左右孩子，返回1
     *       2.2.2 若当前节点没有左孩子，返回右子树的深度
     *       2.2.3 若当前节点没有右孩子，返回左子树的深度
     *       2.2.4 若都没有出现1，2，3的情况，返回左右子树的深度最小值加1到上一层
     * 3.提交记录
     *   3.1 力扣中耗时1ms,消耗39.4MB内存
     *   3.2 leetcode中耗时0ms,消耗39.9MB内存
     * 4. Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     This solution is base on depth traversal
     *     2.1 judge null when traversal
     *     2.2 compare left children tree to right children tree depth
     * 3.About submit record
     *     3.1 1ms and 39.4MB memory in LeetCode China
     *     3.2 0ms and 39.9MB memory in LeetCode
     * 4.Q&A
     *
     * @param root
     * @return
     */
    public int minDepth(BinaryTreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        if(root.left==null){
            return minDepth(root.right)+1;
        }
        if(root.right==null){
            return minDepth(root.left)+1;
        }
        return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }

}
