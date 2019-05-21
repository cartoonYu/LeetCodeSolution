import DataStructure.BinaryTreeNode;
import java.util.*;

/**
 * Problem
 *      103. Binary Tree Zigzag Level Order Traversal
 * Grade of difficulty
 *      Medium
 * Related topics
 *      102. Binary Tree Level Order Traversal
 *      107. Binary Tree Level Order Traversal II
 * @author cartoon
 * @version 1.0
 */
public class Solution103 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n^2)
     *     1.2 Space Complexity is O(log n)
     * 2.how I solve
     *     2.1 use a queue to cache current floor's node
     *     2.2 circulate by queue is not empty
     *              2.2.1 use a integer to record queue's size
     *              2.2.2 circulate 1 to queue size to poll node from queue
     *              2.2.3 use a temp list to cache polled node
     *              2.2.4 add the polled node's childrens to queue
     *              2.2.5 Base on flag to judge how to circulate the temp list
     *              2.2.6 use a list to cache current floor's nodes val
     *              2.2.7 add the integer list to a result list to return
     * 3.About submit record
     *     3.1 3ms and 38.4MB memory in LeetCode China
     *     3.2 1ms and 35.2MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public List<List<Integer>> zigzagLevelOrder(BinaryTreeNode root) {
        if(root==null){
            return Collections.emptyList();
        }
        Deque<BinaryTreeNode> queue=new ArrayDeque<>();
        queue.offer(root);
        boolean flag=true;   //true represent get node from left,false represent get node from right
        List<List<Integer>> result=new LinkedList<>();
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new LinkedList<>();
            List<BinaryTreeNode> temp=new LinkedList<>();
            for(int i=0;i<size;i++){
                BinaryTreeNode node=queue.poll();
                temp.add(node);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            if(flag){
                for(int i=0;i<temp.size();i++){
                    list.add(temp.get(i).val);
                }
                flag=false;
            }
            else{
                for(int i=temp.size()-1;i>=0;i--){
                    list.add(temp.get(i).val);
                }
                flag=true;
            }
            result.add(list);
        }
        return result;
    }
}
