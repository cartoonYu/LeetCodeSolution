import DataStructure.ListNode;

/**
 * Problem
 *      206.Reverse Linked List
 *      https://leetcode.com/problems/reverse-linked-list/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution206 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define a pointer to cache result
     *     2.2 use a java's theory,Deque function addFist
     * 3.About submit record
     *     3.1 1ms and 38.3MB memory in LeetCode China
     *     3.2 0ms and 37.8MB memory in LeetCode
     * 4.Q&A
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode result=null;
        while(head!=null){
            ListNode temp=new ListNode(head.val);
            temp.next=result;
            result=temp;
            head=head.next;
        }
        return result;
    }
}
