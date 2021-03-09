package org.LeetcodeSolution.LinkedList;

import org.LeetcodeSolution.DataStructure.linkedlist.ListNode;

/**
 * Problem
 *     19.Remove Nth Node From End of List
 *     https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 *     https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution19 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 定义一个在head前面的结点
     *     2.2 定义指向2.1定义结点的快慢指针
     *     2.3 因为我们需要移除倒数第n个结点，所以先循环让fast与slow有n个结点的距离
     *     2.4 循环直到fast的下一结点为空
     *     2.5 调整slow的next域，跳过原来的next结点
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗37.5MB内存
     *     3.2 leetcode中耗时0ms,消耗34.8MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 set a node which is in front of head
     *     2.2 define two pointer slow and fast which are point to 2.1 node to delete node
     *     2.3 cause we need to remove Nth node from end,so we use a circulation to set fast to its place
     *     2.4 cause n will always be valid,circulate when fast.next!=null
     *     2.5 set slow next skip its original next
     * 3.About submit record
     *     3.1 1ms and 37.5MB memory in LeetCode China
     *     3.2 0ms and 34.8MB memory in LeetCode
     * 4.Q&A
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        if (head.next == null && n == 1) {
            return head.next;
        }
        ListNode front = new ListNode(-1);
        front.next = head;
        ListNode slow = front;
        ListNode fast = front;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return front.next;
    }
}
