package org.LeetcodeSolution.Tree;

import org.LeetcodeSolution.DataStructure.tree.BinaryTreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Problem
 *      107.Binary Tree Level Order Traversal II
 *      https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 *      https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      102.Binary Tree Level Order Traversal
 *      103.Binary Tree Zigzag Level Order Traversal
 * @author cartoon
 * @version 1.0
 */
public class Solution107 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 定义队列存储遍历的每一层结点
     *     2.2 在进行出队操作时，获取当前队列的长度
     *     2.3 出队直到到达2.2记录的长度，将出队结点的值放在暂存list中，左右孩子入队
     *     2.4 将2.3中的暂存list放在结果list中，遍历完成后返回结果list
     * 3.提交记录
     *     3.1 力扣中耗时3ms,消耗35.8MB内存
     *     3.2 leetcode中耗时1ms,消耗37.4MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 Use a queue to cache current floor's node
     *     2.2 Before poll node from queue,use a integer to record queue's size
     *     2.3 circulate 1 to queue's size,poll node from queue,put node's val to a list and offer node's childrens to queue
     *     2.4 put 2.3's list to a result list and return
     * 3.About submit record
     *     3.1 3ms and 35.8MB memory in LeetCode China
     *     3.2 1ms and 37.4MB memory in LeetCode
     * 4.Q&A
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom(BinaryTreeNode root) {
        if (root == null)
            return Collections.emptyList();

        LinkedList<List<Integer>> result = new LinkedList<>();
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new LinkedList<>();
            int size = queue.size();
            for (int i=0; i < size; i++) {
                BinaryTreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            result.offerFirst(list);
        }

        return result;
    }
}
