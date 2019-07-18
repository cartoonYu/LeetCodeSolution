import DataStructure.BinaryTreeNode;

/**
 * Problem
 *      98.Validate Binary Search Tree/验证二叉搜索树
 *      https://leetcode.com/problems/validate-binary-search-tree/
 *      https://leetcode-cn.com/problems/validate-binary-search-tree/
 * Grade of difficulty
 *      Medium
 * Related topics
 *      94.Binary Tree Inorder Traversal
 *      104.Maximum Depth of Binary Tree
 *      110.Balanced Binary Tree
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
public class Solution98 {

    double last = -Double.MAX_VALUE;

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2。我的解题思路
     *     2.1 这个解法是基于二叉树的中序遍历
     *     2.2 定义一个变量用于存储上一遍历结点的值
     *     2.3 递归遍历二叉树
     *     2.4 如果左子树返回true，对比根节点与缓存变量的值
     *     2.5 如果2.4的对比成立，则将根节点的值赋给缓存变量
     *     2.6 递归遍历右子树
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗37.7MB内存
     *     3.2 leetcode中耗时0ms,消耗38.2MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on inorder traversal
     *     2.2 define a cache variable to cache last traverse node val
     *     2.3 recurse to go though left children tree
     *     2.4 if 2.2 result is true,compare current val with cache variable
     *     2.5 if 2.5 compare result is true,set current val to cache variable
     *     2.6 recurse to go though right children tree
     * 3.About submit record
     *     3.1 1ms and 37.7MB memory in LeetCode China
     *     3.2 0ms and 38.2MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public boolean isValidBST(BinaryTreeNode root) {
        if (root == null) {
            return true;
        }
        if (isValidBST(root.left)) {
            if (last < root.val) {
                last = root.val;
                return isValidBST(root.right);
            }
        }
        return false;
    }
}
