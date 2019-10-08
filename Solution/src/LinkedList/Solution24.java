package LinkedList;

import DataStructure.ListNode;

/**
 * Problem
 *     24.Swap Nodes in Pairs
 *     https://leetcode.com/problems/swap-nodes-in-pairs/
 *     https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 * Grade of difficulty
 *     Medium
 * Related topics
 *     25.Reverse Nodes in k-Group
 *     92.Reverse Linked List II
 *     206.Reverse Linked List
 * @author cartoon
 * @version 1.0
 */
public class Solution24 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个解法基于反转链表
     *     2.2 循环获取链表长度
     *     2.3 循环直到链表剩余长度小于2
     *         2.3.1 循环相邻两个结点并调转
     *         2.3.2 更新指针以及长度
     * 3.提交记录
     *     3.1 力扣中耗时0ms,消耗34.4MB内存
     *     3.2 leetcode中耗时0ms,消耗34.5MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on reverse linkedList
     *     2.2 get linkedList length
     *     2.3 circulate util length<2
     *         2.3.1 circulate pairs node to reverse
     *         2.3.2 update pointer and length
     * 3.About submit record
     *     3.1 0ms and 34.4MB memory in LeetCode China
     *     3.2 0ms and 34.5MB memory in LeetCode
     * 4.Q&A
     *
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode node=new ListNode(-1);
        node.next=head;
        ListNode op=head;
        int length=0;
        while(op!=null){
            op=op.next;
            length++;
        }
        ListNode border=node,cur=head,temp;
        while(length>=2){
            for(int i=1;i<2;i++){
                temp=cur.next;
                cur.next=temp.next;
                temp.next=border.next;
                border.next=temp;
            }
            border=cur;
            cur=border.next;
            length-=2;
        }
        return node.next;
    }
}
