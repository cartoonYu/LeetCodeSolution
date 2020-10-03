package org.LeetcodeSolution.Tree;

import org.LeetcodeSolution.DataStructure.tree.BinaryTreeNode;

/**
 * Problem
 *     230.Kth Smallest Element in a BST
 *     https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 *     https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/
 * Grade of difficulty
 *     Medium
 * Related topics
 *     94.Binary Tree Inorder Traversal
 *     98.Validate Binary Search Tree
 *     104.Maximum Depth of Binary Tree
 *     110.Balanced Binary Tree
 *     111.Minimum Depth of Binary Tree
 *     112.Path Sum
 *     113. Path Sum II
 *     129.Sum Root to Leaf Numbers
 *     144.Binary Tree Preorder Traversal
 *     145.Binary Tree Postorder Traversal
 *     222.Count Complete Tree Nodes
 *     687.Longest Univalue Path
 *     965.Univalued Binary Tree
 * @author cartoon
 * @version 1.0
 */
public class Solution230 {

    private int count;

    private int res;

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个解法基于中序遍历
     *     2.2 定义两个指针记录遍历的次数以及最后结果
     *     2.3 自减count直到0去除当前遍历结点的值
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗40.5MB内存
     *     3.2 leetcode中耗时0ms,消耗37.9MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on inOrder traversal
     *     2.2 define two integer to record traversal time and result
     *     2.3 compare cache integer whether it equals 0 when get current node val
     * 3.About submit record
     *     3.1 1ms and 40.5MB memory in LeetCode China
     *     3.2 0ms and 37.9MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(BinaryTreeNode root, int k) {
        count=k;
        res=-1;
        inOrder(root);
        return res;
    }

    private void inOrder(BinaryTreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        count--;
        if(count==0){
            res=root.val;
        }
        inOrder(root.right);
    }
}
