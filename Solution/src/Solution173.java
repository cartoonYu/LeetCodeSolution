import DataStructure.BinaryTreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Problem
 *      173.Binary Search Tree Iterator
 *      https://leetcode.com/problems/binary-search-tree-iterator/
 * Grade of difficulty
 *      Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution173 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(1)
     *     1.2 Space Complexity is O(h)
     * 2.how I solve
     *     2.1 use a stack to cache min value
     *     2.2 first,use a circulate to get minimum value and put it on the stack's top
     *     2.3 call function next to get top value and use a circulate to get minimum value
     * 3.About submit record
     *     3.1 134ms and 60.8MB memory in LeetCode China
     *     3.2 58ms and 50.4MB memory in LeetCode
     * 4.Q&A
     *     4.1 Q:about time Complexity
     *         A:although use circulate in function next,
     *           I didn't traverse the whole tree,so amortizing time complexity is still O(1),
     *           the same as space complexity
     */
    private Deque<BinaryTreeNode> stack;

    private Deque<Integer> queue;   //another solution data structure

    public Solution173(BinaryTreeNode root) {
        stack=new LinkedList<>();
        queue=new LinkedList<>();
        inOrder(root);
        while(root!=null){
            stack.addFirst(root);
            root=root.left;
        }
    }

    /** @return the next smallest number */
    public int next() {
        BinaryTreeNode temp=stack.removeFirst();
        int num=temp.val;
        temp=temp.right;
        while(temp!=null){
            stack.addFirst(temp);
            temp=temp.left;
        }
        return num;
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on inOrder traverse,it it simple,fast than another solution,but it doesn't match topic
     *     2.2 use a recursion to cache value and put value to queue
     *     2.3 get first element from queue to finish function next
     *     2.4 judge queue's size and return result to finish function hasNext
     * 3.About submit record
     *     3.1 ms and MB memory in LeetCode China
     *     3.2 ms and MB memory in LeetCode
     * 4.Q&A
     */
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return stack.size()!=0;
    }

    private void inOrder(BinaryTreeNode root) {
        if(root==null){
            return;
        }
        inOrder(root.left);
        queue.addLast(root.val);
        inOrder(root.right);
    }

    /** @return the next smallest number */
    public int nextByInOrder() {
        return queue.removeFirst();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNextByInOrder() {
        return stack.size()!=0;
    }
}
