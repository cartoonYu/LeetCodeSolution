import DataStructure.ListNode;

/**
 * Problem
 *     160.Intersection of Two Linked Lists
 *     https://leetcode.com/problems/intersection-of-two-linked-lists/
 *     https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution160 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n+m)(n，m为两个链表的长度)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 当两个链表有相交结点时，无论从长链表或短链表出发，他们的路程是相同的
     *     2.2 定义两个指针分别从长短链表开始遍历，遍历完当前链表换个链表继续遍历，直到两个指针所指结点一样为止
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗38.3MB内存
     *     3.2 leetcode中耗时1ms,消耗38.2MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n+m)(n and m are two list length)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 when two linked list have intersection,whether go though from shorter or longer list,the path are the same
     *     2.2 define two pointer which are point to two list,and go though two list util two pointer are the same
     * 3.About submit record
     *     3.1 1ms and 38.3MB memory in LeetCode China
     *     3.2 1ms and 38.2MB memory in LeetCode
     * 4.Q&A
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode op1=headA,op2=headB;
        while(op1!=op2){
            op1=op1==null?headB:op1.next;
            op2=op2==null?headA:op2.next;
        }
        return op1;
    }
}
