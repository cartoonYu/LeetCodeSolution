package org.LeetcodeSolution.Tree;


import org.LeetcodeSolution.DataStructure.tree.BinaryTreeNode;

/**
 * Problem
 *      112.Path Sum
 *      https://leetcode.com/problems/path-sum/
 *      https://leetcode-cn.com/problems/path-sum/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      98. Validate Binary Search Tree
 *      104.Maximum Depth of Binary Tree
 *      110.Balanced Binary Tree
 *      111.Minimum Depth of Binary Tree
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
public class Solution112 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 这个解法基于深度遍历
     *     2.2 对比当前结点以及sum的值
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗37MB内存
     *     3.2 leetcode中耗时0ms,消耗38.9MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on depth traversal
     *     2.2 compare with current node's val and sum
     * 3.About submit record
     *     3.1 1ms and 37MB memory in LeetCode China
     *     3.2 0ms and 38.9MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum(BinaryTreeNode root, int sum) {
        if(root==null){
            return false;
        }
        if(root.left==null&&root.right==null){
            return root.val==sum;
        }
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}
