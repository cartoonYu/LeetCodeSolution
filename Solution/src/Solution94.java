import DataStructure.BinaryTreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Problem
 *      94.Binary Tree Inorder Traversal
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
 *      687.Longest Univalue Path
 * @author cartoon
 * @version 1.0
 */
public class Solution94 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is similar with <a href="https://github.com/cartoonYu/LeetCodeSolution/blob/master/Solution/src/Solution144.java">Solution144</> and <a href="https://github.com/cartoonYu/LeetCodeSolution/blob/master/Solution/src/Solution144.java">Solution145</>
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
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
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
