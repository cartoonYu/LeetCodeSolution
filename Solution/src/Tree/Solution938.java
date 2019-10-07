package Tree;

import DataStructure.BinaryTreeNode;

/**
 * Problem
 *      938.Range Sum of BST
 *      https://leetcode.com/problems/range-sum-of-bst/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution938 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 compare root.val to L and R,there have three condition
     *          2.1.1 root.val<L,it declare result only appear in the left children tree,recurse left children tree
     *          2.1.2 root.val>R,it declare result only appear in the right children tree,recurse right children tree
     *          2.1.3 root.val is between L and R,plus it with left and right tree recursion's result
     * 3.About submit record
     *     3.1 1ms and 45.2MB memory in LeetCode China
     *     3.2 0ms and 44.2MB memory in LeetCode
     * 4.Q&A
     *     4.1 Q:two solution's time complexity is O(n),why have so great difference in fact?
     *         A:emmm,I think is related to judge condition,inOrder haven't judge condition with value,so it will
     *           traverse whole tree,this solution will select traverse children tree
     * @param root
     * @param L
     * @param R
     * @return
     */
    public int rangeSumBSTByRecursion(BinaryTreeNode root, int L, int R) {
        if(root==null){
            return 0;
        }
        if(root.val<L){
            return rangeSumBSTByRecursion(root.right,L,R);
        }
        if(root.val>R){
            return rangeSumBSTByRecursion(root.left,L,R);
        }
        return root.val+rangeSumBSTByRecursion(root.left,L,R)+rangeSumBSTByRecursion(root.right,L,R);
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 in my first reaction,this topic is related to inOrder,so I write it first
     *     2.2 traditional inorder and compare root.val to L and R
     *     2.3 return cache
     * 3.About submit record
     *     3.1 3ms and 52.7MB memory in LeetCode China
     *     3.2 1ms and 45.1MB memory in LeetCode
     * 4.Q&A
     */
    private int res;

    public int rangeSumBSTByInorder(BinaryTreeNode root, int L, int R) {
        res=0;
        inOrder(root,L,R);
        return res;
    }

    private void inOrder(BinaryTreeNode root,int L,int R){
        if(root==null){
            return;
        }
        inOrder(root.left,L,R);
        if(root.val>=L&&root.val<=R){
            res+=root.val;
        }
        inOrder(root.right,L,R);
    }
}
