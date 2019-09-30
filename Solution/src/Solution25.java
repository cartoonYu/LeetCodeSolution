import DataStructure.ListNode;

/**
 * Problem
 *     25.Reverse Nodes in k-Group
 *     https://leetcode.com/problems/reverse-nodes-in-k-group/
 *     https://leetcode-cn.com/problems/reverse-nodes-in-k-group/
 * Grade of difficulty
 *     Hard
 * Related topics
 *     24.Swap Nodes in Pairs
 * @author cartoon
 * @version 1.0
 */
public class Solution25 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 获取链表长度
     *     2.2 定义四个指针
     *         2.2.1 node，链表的头结点
     *         2.2.2 pre，有序区的边界结点
     *         2.2.3 cur，无序区的第一个元素
     *         2.2.4 temp，操作指针
     *     2.3 k组分别循环
     *         2.3.1 子循环反转k-1个元素
     *         2.3.2 移动各自指针，这一步可以参照反转链表的题目，我觉得这个就是带上一元素的反转链表
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗37.9MB内存
     *     3.2 leetcode中耗时1ms,消耗38.9MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 get list's length first
     *     2.2 define four pointer
     *         2.2.1 node,pre-head node
     *         2.2.2 pre,mark sorted-area
     *         2.2.3 cur,unsorted-area first element
     *         2.2.4 temp,operate pointer
     *     2.3 circulate by k group
     *         2.3.1 reverse list by k
     *         2.3.2 move and adjust pointer
     * 3.About submit record
     *     3.1 1ms and 37.9MB memory in LeetCode China
     *     3.2 1ms and 38.9MB memory in LeetCode
     * 4.Q&A
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode reverseKGroup2(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
        int length=0;
        ListNode op=head;
        while(op!=null){
            op=op.next;
            length++;
        }
        ListNode node=new ListNode(-1);
        node.next=head;
        ListNode pre=node,cur=head,temp;
        while(length>=k){
            for(int i=1;i<k;i++){
                temp=cur.next;
                cur.next=temp.next;
                temp.next=pre.next;
                pre.next=temp;
            }
            pre=cur;
            cur=pre.next;
            length-=k;
        }
        return node.next;
    }
}
