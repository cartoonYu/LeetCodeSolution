import DataStructure.BinaryTreeNode;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Problem
 *      144.Binary Tree Preorder Traversal
 *      https://leetcode.com/problems/binary-tree-preorder-traversal/
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
 *      687.Longest Univalue Path
 * @author cartoon
 * @version 1.0
 */
public class Solution144 {

    private List<Integer> list;

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define a stack to record root node
     *     2.2 push root node to stack and add root node's val to result list
     *     2.3 circulate when stack.size()!=0
     *         2.3.1 pop node from stack,there have three condition with this node
     *               2.3.1.1 if node.left is not null,it prove this node is still useful,
     *                       so push it and the node.left to stack and add node.left.val to result list
     *               2.3.1.2 if node.right is not null,it prove this node is useless,so we only push it's right children to stack
     *                       and add node.right.val to result list
     *               2.3.1.3 if both children is null,we circulate to find it's ancestral node whether have right children,if it has,break the circulate
     *     2.4 remember:never get node's val from stack,replace to find its children's val
     * 3.About submit record
     *     3.1 1ms and 33.7MB memory in LeetCode China
     *     3.2 1ms and 34.8MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public List<Integer> preorderTraversalByStack(BinaryTreeNode root) {
        if(root==null){
            return Collections.emptyList();
        }
        List<Integer> list=new LinkedList<>();
        Deque<BinaryTreeNode> stack=new LinkedList<>();
        list.add(root.val);
        stack.addFirst(root);
        while(stack.size()!=0){
            BinaryTreeNode current=stack.removeFirst();
            if(current.left!=null){
                list.add(current.left.val);
                stack.addFirst(current);
                stack.addFirst(current.left);
            }
            else{
                if(current.right!=null){
                    list.add(current.right.val);
                    stack.addFirst(current.right);
                }
                else{
                    while(stack.size()!=0){
                        BinaryTreeNode temp=stack.removeFirst();
                        if(temp.right!=null){
                            list.add(temp.right.val);
                            stack.addFirst(temp.right);
                            break;
                        }
                    }
                }
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
