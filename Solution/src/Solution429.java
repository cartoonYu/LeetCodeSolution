import DataStructure.NAryTreeNode;

import java.util.*;

/**
 * Problem
 *      429.N-ary Tree Level Order Traversal
 *      https://leetcode.com/problems/n-ary-tree-level-order-traversal/
 * Grade of difficulty
 *      Easy
 * Related topics
 *
 * @author cartoon
 * @version 1.0
 */

public class Solution429 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 This solution is base on level order traversal
     *     2.2 when loop,use a number to record current queue's size
     *     2.3 use a 1 to queue's size loop to poll queue's node
     *     2.4 use a list to record the node's val and put all its children to queue
     *     2.5 add current list to result list to return
     * 3.About submit record
     *     3.1 8ms and 54.8MB memory in LeetCode China
     *     3.2 3ms and 50.2MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(NAryTreeNode root) {
        if(root==null){
            return Collections.emptyList();
        }
        Deque<NAryTreeNode> queue=new ArrayDeque<>();
        queue.offer(root);
        List<List<Integer>> result=new ArrayList<>();
        while(!queue.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                NAryTreeNode node=queue.poll();
                list.add(node.val);
                for(NAryTreeNode temp:node.children){
                    queue.offer(temp);
                }
            }
            result.add(list);
        }
        return result;
    }
}
