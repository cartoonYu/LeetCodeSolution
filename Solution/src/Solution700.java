import DataStructure.BinaryTreeNode;

/**
 * Problem
 *     700.Search in a Binary Search Tree
 *     https://leetcode.com/problems/search-in-a-binary-search-tree/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution700 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on BST
     *     2.2 compare current node val to val,there have three condition
     *          2.2.1 current node val = val,return current node
     *          2.2.2 current node val < val,traverse right children tree
     *          2.2.3 current node val > val,traverse left children tree
     * 3.About submit record
     *     3.1 1ms and 48.7MB memory in LeetCode China
     *     3.2 0ms and 38.3MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @param val
     * @return
     */
    public BinaryTreeNode searchBST(BinaryTreeNode root, int val) {
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        else{
            if(root.val<val){
                return searchBST(root.right,val);
            }
            else{
                return searchBST(root.left,val);
            }
        }
    }

    private BinaryTreeNode res;

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on preOrder traverse
     *     2.2 compare to current val to val,if they equals,set result node to it
     *     2.3 recurse left children tree and right
     * 3.About submit record
     *     3.1 1ms and 38.1MB memory in LeetCode China
     *     3.2 1ms and 38.1MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @param val
     * @return
     */
    public BinaryTreeNode searchBSTByPreOrder(BinaryTreeNode root, int val) {
        preOrder(root,val);
        return res;
    }

    private void preOrder(BinaryTreeNode root,int val){
        if(root==null){
            return;
        }
        if(root.val==val){
            res=root;
            return;
        }
        preOrder(root.left,val);
        preOrder(root.right,val);
    }
}
