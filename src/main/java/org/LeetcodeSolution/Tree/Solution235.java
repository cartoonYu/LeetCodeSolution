package org.LeetcodeSolution.Tree;

import org.LeetcodeSolution.DataStructure.tree.BinaryTreeNode;

/**
 * Problem
 *     235.Lowest Common Ancestor of a Binary Search Tree
 *     https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 *     https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution235 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 题目指出遍历的树为BST，所以我们可以利用这个点去解题
     *     2.2 当前点与p，q的关系
     *         2.2.1 p，q的值都小于当前结点值，p，q都在左子树上
     *         2.2.2 p，q的值都大于当前结点值，p，q都在右子树上
     *         2.2.3 p，q的值一个大于当前结点值，一个小于当前结点值，当前结点就是他们最近公共祖先
     * 3.提交记录
     *     3.1 力扣中耗时11ms,消耗42.3MB内存
     *     3.2 leetcode中耗时4ms,消耗36.6MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 cause topic had pointed the tree is BST,so we use it
     *     2.2 the relation of current root,p and q
     *         2.2.1 p,q val are smaller than root val,node p q must in left children tree
     *         2.2.2 p,q val are bigger than root val,node p q must in right children tree
     *         2.2.3 p,q val,one node val is smaller,one node val is bigger,root is their lowest common ancestor
     *     2.3 use postOrder traversal to traverse root with 2.2 relation
     * 3.About submit record
     *     3.1 11ms and 42.3MB memory in LeetCode China
     *     3.2 4ms and 36.6MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @param p
     * @param q
     * @return
     */
    public BinaryTreeNode lowestCommonAncestor(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {
        if(root.val > p.val && root.val >q.val) return lowestCommonAncestor(root.left,p,q);
        if(root.val <p.val && root.val < q.val) return lowestCommonAncestor(root.right,p,q);
        return root;
    }
}
