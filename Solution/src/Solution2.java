import DataStructure.ListNode;

/**
 * Problem
 *      2. Add Two Numbers
 * Grade of difficulty
 *      Medium
 * Related topics
 *
 * @author cartoon
 * @version 1.0
 */
public class Solution2 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 plus two node's val from head to trail
     *     2.2 if the plus result is greater than 10,divide the result and put it to not null list
     *     2.3 form the result to a new list and return the new list
     * 3.About submit record
     *     3.1 23ms and 41.2MB memory in LeetCode China
     *     3.2 23ms and 41.2MB memory in LeetCode
     * 4.Q&A
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        ListNode temp=result;
        ListNode t1=l1;
        ListNode t2=l2;
        while(t1!=null||t2!=null){
            ListNode node=new ListNode(0);
            if(t1!=null){
                node.val=node.val+t1.val;
                t1=t1.next;
            }
            if(t2!=null){
                node.val=node.val+t2.val;
                t2=t2.next;
            }
            if(node.val>=10){
                int i=node.val/10;
                node.val=node.val-i*10;
                if(t1!=null){
                    t1.val=t1.val+i;
                }
                else {
                    if(t2!=null){
                        t2.val=t2.val+i;
                    }
                    else {
                        t1=new ListNode(i);
                    }
                }
            }
            temp.next=node;
            temp=temp.next;
        }
        return result.next;
    }

}
