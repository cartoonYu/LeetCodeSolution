import DataStructure.ListNode;

/**
 * Problem
 *     237.Delete Node in a Linked List
 *     https://leetcode.com/problems/delete-node-in-a-linked-list/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution237 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(1)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is delete next node basically
     *     2.2 get node.next to cache
     *     2.3 set node.val=cache.val
     *     2.4 set node.next=cache.next
     *     2.45 set cache=null
     * 3.About submit record
     *     3.1 1ms and 37.4MB memory in LeetCode China
     *     3.2 0ms and 36MB memory in LeetCode
     * 4.Q&A
     * @param node
     */
    public void deleteNode(ListNode node) {
        if(node==null||node.next==null){
            return;
        }
        else{
            ListNode temp=node.next;
            node.val=temp.val;
            node.next=temp.next;
            temp=null;
        }
    }
}
