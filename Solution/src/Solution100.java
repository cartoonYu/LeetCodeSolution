import DataStructure.BinaryTreeNode;

/**
 * Problem
 *      100.Same Tree
 *      https://leetcode.com/problems/same-tree/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution100 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 use recursion to compare two tree
     *     2.2 there have three situation of the recursion
     *         2.2.1 p==null and q==null,two node is same
     *         2.2.2 p==null or q==null,cause I judge p==null and q==null before,so this judgement is two node is not same
     *         2.2.3 p.val!=q.val,the two node is not same
     *     2.3 traverse all node by recursion to judge
     * 3.About submit record
     *     3.1 1ms and 33.8MB memory in LeetCode China
     *     3.2 0ms and 33.2MB memory in LeetCode
     * 4.Q&A
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(BinaryTreeNode p, BinaryTreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        if(q.val!=p.val){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
