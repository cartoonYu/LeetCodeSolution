package org.LeetcodeSolution.LinkedList;

import org.LeetcodeSolution.DataStructure.linkedlist.ListNode;

/**
 * Problem
 *      206.Reverse Linked List
 *      https://leetcode.com/problems/reverse-linked-list/
 *      https://leetcode-cn.com/problems/reverse-linked-list/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      24.Swap Nodes in Pairs
 *      25.Reverse Nodes in k-Group
 *      92.Reverse Linked List II
 * @author cartoon
 * @version 1.0
 */
public class Solution206 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 定义一个指针缓存结果
     *     2.2 利用java的一个理论，deque接口的addFirst方法的思想拼接结果
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗38.3MB内存
     *     3.2 leetcode中耗时0ms,消耗37.8MB内存
     * 4.Q&A
     *
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
