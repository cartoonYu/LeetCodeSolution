import DataStructure.BinaryTreeNode;

/**
 * Problem
 *      129.Sum Root to Leaf Numbers
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
 *      144.Binary Tree Preorder Traversal
 *      145.Binary Tree Postorder Traversal
 *      687.Longest Univalue Path
 * @author cartoon
 * @version 1.0
 */
public class Solution129 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on depth traversal
     *     2.2 according to topic,use a integer to cache value
     * 3.About submit record
     *     3.1 1ms and 36.6MB memory in LeetCode China
     *     3.2 0ms and 36.7MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public int sumNumbers(BinaryTreeNode root) {
        if(root==null){
            return 0;
        }
        return sum(root,0);
    }

    private int sum(BinaryTreeNode root,int sum){
        if(root==null){
            return 0;
        }
        sum=10*sum+root.val;
        if(root.left==null&&root.right==null){
            return sum;
        }
        return sum(root.left,sum)+sum(root.right,sum);
    }
}
