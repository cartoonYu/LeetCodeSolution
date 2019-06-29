import DataStructure.BinaryTreeNode;

/**
 * Problem
 *     101.Symmetric Tree
 *     https://leetcode.com/problems/symmetric-tree/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution101 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 judge whether root=null,if it is return true
     *     2.2 compare left tree to right tree,there have five condition
     *          2.2.1 left node==null&&right node==null,return true
     *          2.2.2 left node!=null&&right node==null,return false
     *          2.2.3 left node==null&&right node!=null,return false
     *          2.2.4 left node.val=right node.val,recurse compare its left tree and right tree
     *          2.2.5 left node.val!=right node.val,return false
     * 3.About submit record
     *     3.1 2ms and 36MB memory in LeetCode China
     *     3.2 0ms and 37.4MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public boolean isSymmetric(BinaryTreeNode root) {
        if(root==null){
            return true;
        }
        return judge(root.left,root.right);
    }

    private boolean judge(BinaryTreeNode t1,BinaryTreeNode t2){
        if(t1==null&&t2==null){
            return true;
        }
        else{
            if((t1==null&&t2!=null)||(t1!=null&&t2==null)){
                return false;
            }
            else{
                if(t1.val==t2.val){
                    return judge(t1.left,t2.right)&&judge(t1.right,t2.left);
                }
                else{
                    return false;
                }
            }
        }
    }
}
