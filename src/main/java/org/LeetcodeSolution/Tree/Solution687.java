package org.LeetcodeSolution.Tree;

import org.LeetcodeSolution.DataStructure.tree.BinaryTreeNode;

/**
 * Problem
 *      687.Longest Univalue Path
 *      https://leetcode.com/problems/longest-univalue-path/
 *      https://leetcode-cn.com/problems/longest-univalue-path/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      94.Binary Tree Inorder Traversal
 *      98. Validate Binary Search Tree
 *      104.Maximum Depth of Binary Tree
 *      110.Balanced Binary Tree
 *      111.Minimum Depth of Binary Tree
 *      112.Path Sum
 *      113. Path Sum II
 *      129.Sum Root to Leaf Numbers
 *      145.Binary Tree Postorder Traversal
 *      144.Binary Tree Preorder Traversal
 *      222.Count Complete Tree Nodes
 *      230.Kth Smallest Element in a BST
 *      965.Univalued Binary Tree
 * @author cartoon
 * @version 1.0
 */
public class Solution687 {

    private int max;

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 这个算法基于深度遍历
     *     2.2 统计左右子树的深度，同时判断当前结点val是否等于父节点的val
     * 3.提交记录
     *     3.1 力扣中耗时9ms,消耗51.8MB内存
     *     3.2 leetcode中耗时3ms,消耗40.5MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on depth traversal
     *     2.2 static left and right children tree's depth,and at the same time judge current node's val is same as parent's val
     * 3.About submit record
     *     3.1 9ms and 51.8MB memory in LeetCode China
     *     3.2 3ms and 40.5MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public int longestUnivaluePath(BinaryTreeNode root) {
        if(root==null){
            return 0;
        }
        postOrder(root,root.val);
        return max;
    }

    private int postOrder(BinaryTreeNode root,int val){
        if(root==null){
            return 0;
        }
        int left=postOrder(root.left,root.val);
        int right=postOrder(root.right,root.val);
        max=Math.max(max,left+right);
        if(root.val==val){
            return Math.max(left,right)+1;
        }
        return 0;
    }
}
