import DataStructure.ListNode;

/**
 * Problem
 *     82.Remove Duplicates from Sorted List II
 *     https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
 *     https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution82 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个算法基于快慢指针实现
     *     2.2 定义一个结点为原链表的头结点
     *     2.3 定义快慢指针，快指针指向原来的头结点head，慢指针指向2.2定义的结点
     *     2.4 循环遍历链表直到快指针为null，有两个情况
     *         2.4.1 快指针指向的值等于下一结点的值，移动快指针直到这个条件失效，移动快慢指针指向快指针的下一元素
     *         2.4.2 快指针指向的值不等于下一结点的值，常规移动快慢指针
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗36.6MB内存
     *     3.2 leetcode中耗时1ms,消耗36.7MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on fast-slow pointer
     *     2.2 define a node as origin list head node
     *     2.3 define a slow pointer point to 2.2 node,fast pointer point to head
     *     2.4 circulate until fast is null,there have two condition
     *         2.4.1 fast.val equals to fast.next.val,move fast pointer when this condition will be false,move both slow and fast to fast next
     *         2.4.2 fast.val is not equals to fast.next.val,move both two pointer to next node
     * 3.About submit record
     *     3.1 1ms and 36.6MB memory in LeetCode China
     *     3.2 1ms and 36.7MB memory in LeetCode
     * 4.Q&A
     *
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode node=new ListNode(head.val-1);
        node.next=head;
        ListNode slow=node,fast=head;
        ListNode tempFast;
        while(fast!=null){
            tempFast=fast;
            while(fast.next!=null&&fast.next.val==fast.val){
                fast=fast.next;
            }
            if(tempFast==fast){
                slow=slow.next;
                fast=fast.next;
            }
            else{
                fast=fast.next;
                slow.next=fast;
            }
        }
        return node.next;
    }
}
