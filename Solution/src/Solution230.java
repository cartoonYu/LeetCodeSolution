import DataStructure.BinaryTreeNode;

/**
 * Problem
 *     230.Kth Smallest Element in a BST
 *     https://leetcode.com/problems/kth-smallest-element-in-a-bst/
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
 *     687.Longest Univalue Path
 *     965.Univalued Binary Tree
 * @author cartoon
 * @version 1.0
 */
public class Solution230 {

    private int count;

    private int res;

    /**
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
