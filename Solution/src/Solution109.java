import DataStructure.BinaryTreeNode;
import DataStructure.ListNode;

/**
 * Problem
 *     109.Convert Sorted List to Binary Search Tree
 *     https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
 * Grade of difficulty
 *     Medium
 * Related topics
 *     108.Convert Sorted Array to Binary Search Tree
 * @author cartoon
 * @version 1.0
 */
public class Solution109 {

    private ListNode op;

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on binary search and inOrder
     *     2.2 circulate head,get List's length
     *     2.3 use a inOrder to build tree
     *              2.3.1 get mid index
     *              2.3.2 according to mid index,recursion to build left tree and right tree
     *     2.4 return root node
     * 3.About submit record
     *     3.1 2ms and 42.4MB memory in LeetCode China
     *     3.2 1ms and 37.7MB memory in LeetCode
     * 4.Q&A
     * @param head
     * @return
     */
    public BinaryTreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        op=head;
        int length=0;
        while(head!=null){
            length++;
            head=head.next;
        }
        return build(0,length-1);
    }

    private BinaryTreeNode build(int start,int end){
        if(start>end){
            return null;
        }
        int mid=start+((end-start)>>1);
        BinaryTreeNode left=build(start,mid-1);
        BinaryTreeNode root=new BinaryTreeNode(op.val);
        op=op.next;
        root.left=left;
        root.right=build(mid+1,end);
        return root;
    }
}
