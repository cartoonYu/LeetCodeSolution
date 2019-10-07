package LinkedList;

import DataStructure.ListNode;

/**
 * Problem
 *     203.Remove Linked List Elements
 *     https://leetcode.com/problems/remove-linked-list-elements/
 *     https://leetcode-cn.com/problems/remove-linked-list-elements/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution203 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个算法基于快慢指针
     *     2.2 定义两个指针遍历链表，有两种情况
     *         2.2.1 fast.val=val,移动fast到下一节点，slow的next域指向fast
     *         2.2.2 fast.val!=val,同时移动两个指针到下一节点
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗39.2MB内存
     *     3.2 leetcode中耗时1ms,消耗39.5MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on fast-slow arithmetic
     *     2.2 define two pointer to go though list,there have two condition
     *          2.2.1 current node(fast).val=val,move fast to next node,use slow to point to it
     *          2.2.2 current node.val!=val,move fast and slow to next node apart
     * 3.About submit record
     *     3.1 1ms and 39.2MB memory in LeetCode China
     *     3.2 1ms and 39.5MB memory in LeetCode
     * 4.Q&A
     *     4.1 Q:why this solution is so fast than another?
     *         A:I think it is about judge time,this solution only judge one time but another solution judge two time.
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        if(head.next==null){
            if(head.val==val){
                head=head.next;
            }
            return head;
        }
        ListNode slow=head,fast=head.next;
        while(fast!=null){
            if(fast.val==val){
                fast=fast.next;
                slow.next=fast;
            }
            else{
                fast=fast.next;
                slow=slow.next;
            }
        }
        if(head.val==val){
            head=head.next;
        }
        return head;
    }

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 定义一个指针遍历链表，有两种情况
     *         2.2.1 当前的next结点的值等于val，移动指针到这个点的下一结点
     *         2.2.2 其他情况，直接移动指针到下一结点
     * 3.提交记录
     *     3.1 力扣中耗时3ms,消耗40.9MB内存
     *     3.2 leetcode中耗时7ms,消耗44.8MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 define one pointer to go though list,there have two condition
     *          2.1.1 next node is not null and its val = val,move pointer to point to its next node
     *          2.1.2 another condition,move pointer to its next node
     * 3.About submit record
     *     3.1 3ms and 40.9MB memory in LeetCode China
     *     3.2 7ms and 44.8MB memory in LeetCode
     * 4.Q&A
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElementsByOnePointer(ListNode head, int val) {
        if(head==null){
            return head;
        }
        ListNode temp=head;
        while(temp!=null){
            ListNode node=temp.next;
            if(node!=null&&node.val==val){
                temp.next=node.next;
            }
            else{
                temp=temp.next;
            }
        }
        if(head.val==val){
            return removeElements(head.next,val);
        }
        return head;
    }
}
