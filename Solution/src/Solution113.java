import DataStructure.BinaryTreeNode;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Problem
 *      113.Path Sum II
 *      https://leetcode.com/problems/path-sum-ii/
 * Grade of difficulty
 *      Medium
 * Related topics
 *      98. Validate Binary Search Tree
 *      104.Maximum Depth of Binary Tree
 *      110.Balanced Binary Tree
 *      111.Minimum Depth of Binary Tree
 *      112.Path Sum
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
public class Solution113 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on depth traversal
     *     2.2 if current node haven't left and right children,judge current num and current node's val
     *     2.3 remove last element from temp list
     * 3.About submit record
     *     3.1 4ms and 37.8MB memory in LeetCode China
     *     3.2 1ms and 37.7MB memory in LeetCode
     * 4.Q&A
     */
    private List<List<Integer>> res;

    public List<List<Integer>> pathSum(BinaryTreeNode root, int sum) {
        res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        preOrder(root,list,sum);
        return res;
    }

    private void preOrder(BinaryTreeNode root, List<Integer> list, int num){
        if(root==null){
            return;
        }
        list.add(root.val);
        if(root.left==null&&root.right==null&&root.val==num){
            res.add(new LinkedList<>(list));
        }
        preOrder(root.left,list,num-root.val);
        preOrder(root.right,list,num-root.val);
        list.remove(list.size()-1);
    }
}
