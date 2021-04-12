package org.LeetcodeSolution.LinkedList;

import org.LeetcodeSolution.DataStructure.linkedlist.ListNode;

/**
 * Problem
 *     237.Delete Node in a Linked List
 *     https://leetcode.com/problems/delete-node-in-a-linked-list/
 *     https://leetcode.com/problems/delete-node-in-a-linked-list/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution237 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(1)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个算法基本是删除下一节点的替换策略
     *     2.2 存储待删除结点的下一节点的值
     *     2.3 设定待删除结点的值为2.2的值
     *     2.4 设定待删除结点的下一节点为它的下下结点
     *     2.5 删除待删除结点的下一结点
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗37.4MB内存
     *     3.2 leetcode中耗时0ms,消耗36MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(1)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is delete next node basically
     *     2.2 get node.next to cache
     *     2.3 set node.val=cache.val
     *     2.4 set node.next=cache.next
     *     2.5 set cache=null
     * 3.About submit record
     *     3.1 1ms and 37.4MB memory in LeetCode China
     *     3.2 0ms and 36MB memory in LeetCode
     * 4.Q&A
     * @param node
     */
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return;
        } else {
            ListNode temp = node.next;
            node.val = temp.val;
            node.next = temp.next;
            temp = null;
        }
    }
}
