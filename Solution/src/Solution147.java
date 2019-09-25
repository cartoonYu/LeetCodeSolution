import DataStructure.ListNode;

/**
 * Problem
 *     147.Insertion Sort List
 *     https://leetcode.com/problems/insertion-sort-list/
 *     https://leetcode-cn.com/problems/insertion-sort-list/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution147 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n^2)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 使用自定义头结点方便运算
     *     2.2 使用三个指针完成功能
     *     2.3 因为我们需要取有序区的下一结点作为我们的操作结点，所以循环排序的终止条件为right.next==null
     *     2.4 循环遍历直到right.next==null，有两种情况
     *         2.4.1 当前结点的值大于right结点的值，移动right
     *         2.4.2 当前结点的值大于right结点的值，循环找到插入的位置，改变指针的指向
     * 3.提交记录
     *     3.1 力扣中耗时4ms,消耗37.8MB内存
     *     3.2 leetcode中耗时3ms,消耗37.3MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 use before-head node to mark begin
     *     2.2 use three pointer finish function
     *     2.3 cause we need get sorted-region next node and insert into sorted-region,so circulation's end condition is right.next==null
     *     2.4 circulate when right.next!=null,there have two  condition
     *         2.4.1 current node's val is bigger than right.val,move right to op directly
     *         2.4.2 current node's val is smaller than right.val,circulate when temp.next>current node's val,change pointer point
     * 3.About submit record
     *     3.1 4ms and 37.8MB memory in LeetCode China
     *     3.2 3ms and 37.3MB memory in LeetCode
     * 4.Q&A
     *
     * @param head
     * @return
     */
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode node=new ListNode(Integer.MIN_VALUE);
        node.next=head;
        ListNode right=node,op,temp;
        while(right.next!=null){
            op=right.next;
            if(op.val>=right.val){
                right=right.next;
            }
            else{
                temp=node;
                while(temp.next.val<op.val){
                    temp=temp.next;
                }
                right.next=op.next;
                op.next=temp.next;
                temp.next=op;
            }
        }
        return node.next;
    }

}
