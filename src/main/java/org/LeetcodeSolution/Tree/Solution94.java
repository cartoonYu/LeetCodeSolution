package org.LeetcodeSolution.Tree;

import org.LeetcodeSolution.DataStructure.tree.BinaryTreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Problem
 *      94.Binary Tree Inorder Traversal/二叉树的中序遍历
 *      https://leetcode.com/problems/binary-tree-inorder-traversal/
 *      https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 * Grade of difficulty
 *      Medium
 * Related topics
 *      98. Validate Binary Search Tree
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
public class Solution94 {

    /**
     * 1.关于复杂度
     *      1.1 时间复杂度为O(n)
     *      1.2 空间负责度为O(n)
     * 2.我的解题思路
     *      2.1 这个解法是基于第144题的解法进行实现
     *     2.2 利用操作节点不为空以及操作栈不为空的或操作为条件进行循环
     *         2.2.1 循环深度递归获取操作节点的左子树
     *         2.2.2 获取并移除栈顶结点，记录该结点的值
     *         2.2.3 2.2.2中获取的结点有右子树的话，将操作结点的值设置为栈顶结点的右孩子
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗34.6MB内存
     *     3.2 leetcode中耗时1ms,消耗34.6MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is similar with <a href="https://github.com/cartoonYu/LeetCodeSolution/blob/master/Solution/src/Solution144.java">Tree.Solution144</> and <a href="https://github.com/cartoonYu/LeetCodeSolution/blob/master/Solution/src/Solution144.java">Tree.Solution145</>
     *     2.2 define a list and a stack,list for record result and stack for cache treeNode
     *     2.2 circulate with op!=null or stack.size()!=0
     *                   2.2.1 circulate with op pointer to depth traverse left children
     *                   2.2.2 remove the top treeNode,record its val to result list
     *                   2.2.3 if the top treeNode has right children,change op to node's children
     * 3.About submit record
     *     3.1 1ms and 34.6MB memory in LeetCode China
     *     3.2 1ms and 34.6MB memory in LeetCode
     * 4.Q&A
     */
    private List<Integer> list;

    public List<Integer> inorderTraversal(BinaryTreeNode root) {
        list=new LinkedList<>();
        inOrder(root);
        return list;
    }

    private void inOrder(BinaryTreeNode op){
        if(op==null){
            return;
        }
        Deque<BinaryTreeNode> stack=new LinkedList<>();
        while(stack.size()!=0||op!=null){
            while(op!=null){
                stack.addFirst(op);
                op=op.left;
            }
            if(stack.size()!=0){
                BinaryTreeNode node=stack.removeFirst();
                list.add(node.val);
                if(node.right!=null){
                    op=node.right;
                }
            }
        }
    }

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 递归遍历左子树
     *     2.2 将当前结点的值加入到结果列表中
     *     2.3 递归遍历右子树
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗34.7MB内存
     *     3.2 leetcode中耗时0ms,消耗34.6MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on inOrder traverse
     *     2.2 go though left tree,put root's val to result list,go though right tree
     * 3.About submit record
     *     3.1 1ms and 34.7MB memory in LeetCode China
     *     3.2 0ms and 34.6MB memory in LeetCode
     * 4.Q&A
     */
    private List<Integer> listByRecursion;

    public List<Integer> inorderTraversalByRecursion(BinaryTreeNode root) {
        listByRecursion=new LinkedList<>();
        inOrderByRecursion(root);
        return listByRecursion;
    }

    private void inOrderByRecursion(BinaryTreeNode root){
        if(root==null){
            return;
        }
        inOrderByRecursion(root.left);
        listByRecursion.add(root.val);
        inOrderByRecursion(root.right);
    }
}
