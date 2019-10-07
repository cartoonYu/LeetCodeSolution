package Tree;

import DataStructure.BinaryTreeNode;

import java.util.*;

/**
 * Problem
 *      102. Binary Tree Level Order Traversal
 *      https://leetcode.com/problems/binary-tree-level-order-traversal/
 * Grade of difficulty
 *      Medium
 * Related topics
 *      103. Binary Tree Zigzag Level Order Traversal
 *      107. Binary Tree Level Order Traversal II
 * @author cartoon
 * @version 1.0
 */
public class Solution102 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n^2)
     *     1.2 Space Complexity is O(log n)
     * 2.how I solve
     *     2.1 use a queue to cache current floor's node
     *     2.2 circulate by queue is not empty
     *              2.2.1 use a integer to record queue's size
     *              2.2.2 circulate 1 to queue size to poll node from queue
     *              2.2.3 add the polled node's val to a list
     *              2.2.4 add the polled node's children to queue
     *              2.2.5 add the vals list to result list
     * 3.About submit record
     *     3.1 3ms and 38.4MB memory in LeetCode China
     *     3.2 1ms and 37.4MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(BinaryTreeNode root) {
        if(root==null){
            return Collections.emptyList();
        }
        List<List<Integer>> result=new ArrayList<>();
        Deque<BinaryTreeNode> queue=new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                BinaryTreeNode temp=queue.poll();
                list.add(temp.val);
                if(temp.left!=null){
                    queue.offer(temp.left);
                }
                if(temp.right!=null){
                    queue.offer(temp.right);
                }
            }
            result.add(list);
        }
        return result;
    }
}

