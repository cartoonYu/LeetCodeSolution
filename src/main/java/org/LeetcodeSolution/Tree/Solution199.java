package org.LeetcodeSolution.Tree;

import org.LeetcodeSolution.DataStructure.tree.BinaryTreeNode;

import java.util.*;

/**
 * Problem
 *     199.Binary Tree Right Side View
 *     https://leetcode.com/problems/binary-tree-right-side-view/
 *     https://leetcode-cn.com/problems/binary-tree-right-side-view/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution199 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 定义队列存储遍历当前层的结点
     *     2.2 每次出队结点，左右孩子的添加顺序为右孩子到左孩子
     * 3.提交记录
     *     3.1 力扣中耗时3ms,消耗37MB内存
     *     3.2 leetcode中耗时1ms,消耗37.2MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define a queue to cache node
     *     2.2 add node from right to left to queue
     * 3.About submit record
     *     3.1 3ms and 37MB memory in LeetCode China
     *     3.2 1ms and 37.2MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public List<Integer> rightSideView(BinaryTreeNode root) {
        if(root==null){
            return Collections.emptyList();
        }
        Deque<BinaryTreeNode> queue=new ArrayDeque<>();
        queue.offer(root);
        List<Integer> result=new ArrayList<>();
        result.add(root.val);
        int size=1;
        while(!queue.isEmpty()){
            BinaryTreeNode node = queue.poll();
            size--;
            if (node.right != null) queue.offer(node.right);
            if (node.left != null) queue.offer(node.left);
            if (size == 0) {
                size = queue.size();
                if (size != 0) result.add(queue.peek().val);
            }
        }
        return result;
    }
}
