package org.LeetcodeSolution.LinkedList;

import org.LeetcodeSolution.DataStructure.linkedlist.ListNode;

/**
 * Problem
 *     61.Rotate List
 *     https://leetcode.com/problems/rotate-list/
 *     https://leetcode-cn.com/problems/rotate-list/
 * Grade of difficulty
 *     Medium
 * Related topics
 *     189.Rotate Array
 * @author cartoon
 * @version 1.0
 */
public class Solution61 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个解法基于快慢指针
     *     2.2 获取链表长度
     *     2.3 快慢指针，两指针之间的距离为k(k经过length的取余处理)
     *     2.4 循环直到fast的下一结点为空
     *     2.5 使用result指针标记快链表开始的位置(slow的下一结点)
     *     2.6 分拆源链表为两段链表，根据指针指向拼接新链表返回
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗35.8MB内存
     *     3.2 leetcode中耗时0ms,消耗37.7MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on fast-slow pointer
     *     2.2 get list length
     *     2.3 use fast and slow pointer,their interval is k(k is reminder by 2.2 length)
     *     2.4 circulate util fast pointer next element is null
     *     2.5 use a result pointer mark fast list start(slow.next)
     *     2.6 spin off list according to slow,result,fast,head,form a new list to return
     * 3.About submit record
     *     3.1 1ms and 35.8MB memory in LeetCode China
     *     3.2 0ms and 37.7MB memory in LeetCode
     * 4.Q&A
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        k=k%length;
        if(k==0){
            return head;
        }
        ListNode slow=head,fast=head;
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode res=slow.next;
        slow.next=fast.next;
        fast.next=head;
        return res;
    }
}

