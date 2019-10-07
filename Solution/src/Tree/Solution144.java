package Tree;

import DataStructure.BinaryTreeNode;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Problem
 *      144.Binary Tree Preorder Traversal
 *      https://leetcode.com/problems/binary-tree-preorder-traversal/
 *      https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 * Grade of difficulty
 *      Medium
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
 *      222.Count Complete Tree Nodes
 *      230.Kth Smallest Element in a BST
 *      687.Longest Univalue Path
 *      965.Univalued Binary Tree
 * @author cartoon
 * @version 1.0
 */
public class Solution144 {

    private List<Integer> list;

    /**
     * 1. 关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2. 我的解题思路
     *     2.1 利用API定义一个栈存储计算过程中的结点
     *     2.2 首先将根节点加入到栈中
     *     2.3 循环直到栈为空
     *         2.3.1 移除栈顶结点并将它的值加入结果list中
     *         2.3.2 如果2.3.1结点的右孩子不为空，将右孩子加入栈
     *         2.3.3 如果2.3.1结点的左孩子不为空，将右左孩子加入栈
     * 3. 提交记录
     *     3.1 力扣中耗时1ms,消耗34.9MB内存
     *     3.2 leetcode中耗时1ms,消耗34.6MB内存
     * 4. Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define a stack to cache cal node
     *     2.2 add root node first
     *     2.3 circulate when stack size isn't 0
     *         2.3.1 remove top node and put its val to result list
     *         2.3.2 add 2.3.1 node right children when it isn't null
     *         2.3.3 add 2.3.1 node left children when it isn't null
     * 3.About submit record
     *     3.1 1ms and 34.9MB memory in LeetCode China
     *     3.2 1ms and 34.6MB memory in LeetCode
     * 4.Q&A
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversalByStack(BinaryTreeNode root) {
        if(root==null){
            return Collections.emptyList();
        }
        List<Integer> list=new LinkedList<>();
        Deque<BinaryTreeNode> stack=new LinkedList<>();
        stack.addFirst(root);
        while(stack.size()!=0){
            root=stack.pollFirst();
            list.add(root.val);
            if(root.right!=null){
                stack.addFirst(root.right);
            }
            if(root.left!=null){
                stack.addFirst(root.left);
            }
        }
        return list;
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 use traditional recursion to get val from tree,it has nothing special
     * 3.About submit record
     *     3.1 1ms and 36.2MB memory in LeetCode China
     *     3.2 0ms and 36.2MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public List<Integer> preorderTraversalByRecursion(BinaryTreeNode root){
        list=new LinkedList<>();
        preOrder(root);
        return list;
    }

    private void preOrder(BinaryTreeNode root){
        if(root==null){
            return;
        }
        list.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

}
