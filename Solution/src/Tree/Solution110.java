package Tree;

import DataStructure.BinaryTreeNode;

/**
 * Problem
 *      110.Balanced Binary Tree
 *      https://leetcode.com/problems/balanced-binary-tree/
 *      https://leetcode-cn.com/problems/balanced-binary-tree/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      94.Binary Tree Inorder Traversal
 *      98. Validate Binary Search Tree
 *      104.Maximum Depth of Binary Tree
 *      111.Minimum Depth of Binary Tree
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
public class Solution110 {

    /**
     * 1.关于复杂度
     *    1.1 时间复杂度为O(n)
     *    1.2 空间负责度为O(n)
     * 2.我的解题思路
     *    2.1 解法基于深度优先遍历
     *    2.2 递归获取左右子树的深度
     *    2.3 对比左右子树的深度
     *        2.3.1 若出现深度为-1的情况，返回-1到上一层
     *        2.3.2 若出现左右子树深度之差大于1的情况，返回-1到上一层
     *        2.3.3 若没有出现1，2的情况，返回左右子树的深度最大值加1到上一层
     * 3.提交记录
     *    3.1 力扣中耗时2ms,消耗39.5MB内存
     *    3.2 leetcode中耗时0ms,消耗38.6MB内存
     * 4. Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on depth traversal
     *     2.2 static height of left right children tree,compare their height
     * 3.About submit record
     *     3.1 2ms and 39.5MB memory in LeetCode China
     *     3.2 0ms and 38.6MB memory in LeetCode
     * 4.Q&A
     *
     * @param root
     * @return
     */
    public boolean isBalanced(BinaryTreeNode root) {
        return height(root)!=-1;
    }

    private int height(BinaryTreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        if(left==-1){
            return -1;
        }
        int right=height(root.right);
        if(right==-1||Math.abs(left-right)>1){
            return -1;
        }
        return Math.max(left,right)+1;
    }
}
