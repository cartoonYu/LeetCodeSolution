package org.LeetcodeSolution.LinkedList;

import org.LeetcodeSolution.DataStructure.linkedlist.ListNode;

/**
 * Problem
 *     92.Reverse Linked List II
 *     https://leetcode.com/problems/reverse-linked-list-ii/
 *     https://leetcode-cn.com/problems/reverse-linked-list-ii/
 * Grade of difficulty
 *     Medium
 * Related topics
 *     24.Swap Nodes in Pairs
 *     25.Reverse Nodes in k-Group
 *     206.Reverse Linked List
 * @author cartoon
 * @version 1.0
 */
public class Solution92 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 形成一个带头结点的单链表
     *     2.2 利用m找到反转链表的左边界
     *     2.3 将m到n的结点反转
     * 3.提交记录
     *     3.1 力扣中耗时0ms,消耗34.3MB内存
     *     3.2 leetcode中耗时0ms,消耗34.5MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 form a list which has head node
     *     2.2 find reverse linked list left border
     *     2.3 reverse list from m to n
     * 3.About submit record
     *     3.1 0ms and 34.3MB memory in LeetCode China
     *     3.2 0ms and 34.5MB memory in LeetCode
     * 4.Q&A
     * @param head
     * @param m
     * @param n
     * @return
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode start = res;
        for (int i = 1; i < m; i++) {
            start = start.next;
        }
        ListNode temp = null, op;
        for (int i = m - 1; i < n; i++) {
            if (temp == null) {
                temp = start.next;
            } else {
                op = temp.next;
                temp.next = op.next;
                op.next = start.next;
                start.next = op;
            }
        }
        return res.next;
    }
}
