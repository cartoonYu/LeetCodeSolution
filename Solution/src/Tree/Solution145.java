package Tree;

import DataStructure.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Problem
 *      145.Binary Tree Postorder Traversal
 *      https://leetcode.com/problems/binary-tree-postorder-traversal/
 *      https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
 * Grade of difficulty
 *      Hard
 * Related topics
 *      94.Binary Tree Inorder Traversal
 *      98. Validate Binary Search Tree
 *      104.Maximum Depth of Binary Tree
 *      110.Balanced Binary Tree
 *      111.Minimum Depth of Binary Tree
 *      112.Path Sum
        113. Path Sum II
 *      129.Sum Root to Leaf Numbers
 *      144.Binary Tree Preorder Traversal
 *      222.Count Complete Tree Nodes
 *      230.Kth Smallest Element in a BST
 *      687.Longest Univalue Path
 *      965.Univalued Binary Tree
 * @author cartoon
 * @version 1.0
 */
public class Solution145 {

    /**
     * 1. 关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2. 我的解题思路
     *     2.1 定义一个list以及栈(list为结果list，stack用于存储计算过程中的结点)
     *     2.2 循环直到op为空或者栈为空
     *         2.2.1 循环深度遍历op的左孩子并把它加入栈
     *         2.2.2 获取栈顶结点
     *               2.2.2.1 如果栈顶结点有右孩子，改变op的指向以及将原结点的右孩子设置为空
     *               2.2.2.2 如果栈顶结点没有右孩子，将它的值加入到结果list中
     * 3. 提交记录
     *     3.1 力扣中耗时2ms,消耗34.2MB内存
     *     3.2 leetcode中耗时1ms,消耗34.7MB内存
     * 4. Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define a list list and a stack(list for record result,stack for cache treeNode)
     *     2.2 circulate with op!=null or stack.size()!=0
     *              2.2.1 circulate with op pointer to depth traverse left children
     *              2.2.2 get the top treeNode
     *                      2.2.2.1 if it has right children,change op to node's children and set quondam node's right children
     *                      2.2.2.2 if it hasn't right children,put node's val to result list
     * 3.About submit record
     *     3.1 2ms and 34.2MB memory in LeetCode China
     *     3.2 1ms and 34.7MB memory in LeetCode
     * 4.Q&A
     */
    private List<Integer> list;

    public List<Integer> postorderTraversal(BinaryTreeNode root) {
        list=new LinkedList<>();
        postOrder(root);
        return list;
    }

    private void postOrder(BinaryTreeNode root){
        if(root==null){
            return;
        }
        Deque<BinaryTreeNode> stack=new LinkedList<>();
        BinaryTreeNode op=root;
        while(op!=null||stack.size()!=0){
            while(op!=null){
                stack.addFirst(op);
                op=op.left;
            }
            if(stack.size()!=0){
                BinaryTreeNode node=stack.peekFirst();
                if(node.right==null){
                    stack.removeFirst();
                    list.add(node.val);
                }
                else{
                    op=node.right;
                    node.right=null;
                }
            }
        }
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on postOrder traverse
     *     2.2 go though left tree and right tree apart,and put root's val to result list
     * 3.About submit record
     *     3.1 1ms and 34.2MB memory in LeetCode China
     *     3.2 0ms and 36.2MB memory in LeetCode
     * 4.Q&A
     */
    private List<Integer> listByRecursion;

    public List<Integer> postorderTraversalByRecursion(BinaryTreeNode root) {
        listByRecursion=new LinkedList<>();
        postOrderByRecursion(root);
        return listByRecursion;
    }

    private void postOrderByRecursion(BinaryTreeNode root){
        if(root==null){
            return;
        }
        postOrderByRecursion(root.left);
        postOrderByRecursion(root.right);
        listByRecursion.add(root.val);
    }
}
